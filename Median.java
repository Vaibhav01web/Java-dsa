import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Median {
    
    // Function to check if a value X is attainable
    private static boolean check(int X, int n, int[] a, int[] b) {
        long currentSum = 0;
        long minPrefix = 0;
        
        for (int i = 0; i < n; i++) {
            int mn = Math.min(a[i], b[i]);
            int mx = Math.max(a[i], b[i]);
            
            if (mx < X) {
                // This column cannot be part of our valid subarray, reset tracking
                currentSum = 0;
                minPrefix = 0;
            } else {
                if (mn >= X) {
                    currentSum += 1;
                } else {
                    currentSum -= 1;
                }
                
                // If the maximum subarray sum ending at index i is > 0, X is possible
                if (currentSum - minPrefix > 0) {
                    return true;
                }
                
                minPrefix = Math.min(minPrefix, currentSum);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();
        
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = fs.nextInt();
            }
            
            // Binary search range for the maximum possible min(a1, b1)
            int low = 1;
            int high = 2 * n;
            int ans = 1;
            
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (check(mid, n, a, b)) {
                    ans = mid;
                    low = mid + 1; // Try to find a larger valid value
                } else {
                    high = mid - 1; // Try smaller values
                }
            }
            
            sb.append(ans).append("\n");
        }
        
        // Fast output
        System.out.print(sb);
    }

    // Fast I/O helper class
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}