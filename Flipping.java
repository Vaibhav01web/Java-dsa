import java.io.*;
import java.util.*;

public class Flipping {

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();

            long[] a = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = fs.nextLong();
            }

            ArrayList<Integer> ops = new ArrayList<>();

            // 0 = even flips
            // 1 = odd flips
            int flip = 0;

            for (int i = n; i >= 1; i--) {

                long current = a[i];

                // apply virtual flips
                if (flip % 2 == 1) {
                    current = -current;
                }

                // if current value is positive,
                // flip prefix [1...i]
                if (current > 0) {
                    ops.add(i);
                    flip ^= 1;
                }
            }

            out.append(ops.size()).append("\n");

            for (int x : ops) {
                out.append(x).append(" ");
            }

            out.append("\n");
        }

        System.out.print(out);
    }
}