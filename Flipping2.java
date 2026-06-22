import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Flipping2 {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader(System.in);
        StringBuilder sb = new StringBuilder();
        
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }
            
            // To collect operations based on their initial state
            ArrayList<Integer> posOps = new ArrayList<>();
            ArrayList<Integer> negOps = new ArrayList<>();
            
            int currentFlip = 0;
            
            // Step 1: Scan right-to-left to determine which indices MUST be operated on
            for (int i = n; i >= 1; i--) {
                // Calculate what the sign of a[i] would be based on operations to its right
                long effectiveValue = a[i];
                if (currentFlip % 2 != 0) {
                    effectiveValue = -effectiveValue;
                }
                
                // If it's going to end up negative, we want to flip it (unless it's impossible, like a[n] < 0)
                if (effectiveValue < 0) {
                    // For a[n], if it's negative, we can never fix it because we can't operate at n if a[n] < 0
                    if (i == n) {
                        continue;
                    }
                    
                    // We need to perform an operation at index i
                    if (a[i] > 0) {
                        posOps.add(i); // Originally positive: must be done early
                    } else {
                        negOps.add(i); // Originally negative: must be done late
                    }
                    currentFlip++;
                }
            }
            
            // Total operations performed
            int totalOps = posOps.size() + negOps.size();
            sb.append(totalOps).append("\n");
            
            if (totalOps > 0) {
                // Step 2: Print originally positive operations from left-to-right (ascending index)
                for (int i = posOps.size() - 1; i >= 0; i--) {
                    sb.append(posOps.get(i)).append(" ");
                }
                // Step 3: Print originally negative operations from right-to-left (descending index)
                for (int i = 0; i < negOps.size(); i++) {
                    sb.append(negOps.get(i)).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }

    // Direct byte-buffer stream reader for absolute minimum I/O latency
    static class FastReader {
        private final InputStream stream;
        private final byte[] buffer = new byte[1 << 16];
        private int head = 0;
        private int tail = 0;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int read() throws IOException {
            if (head >= tail) {
                head = 0;
                tail = stream.read(buffer, 0, buffer.length);
                if (tail <= 0) return -1;
            }
            return buffer[head++];
        }

        public int nextInt() throws IOException {
            int c = read();
            while (c <= 32) {
                if (c == -1) return -1;
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            int res = 0;
            while (c > 32) {
                if (c < '0' || c > '9') throw new IOException();
                res = res * 10 + (c - '0');
                c = read();
            }
            return neg ? -res : res;
        }
    }
}