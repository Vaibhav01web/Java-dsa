import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Village {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            long[] a = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            ArrayList<Integer> ops = new ArrayList<>();
            // Track how many times the prefix has been flipped
            int flipCount = 0;

            // Process backwards from right to left
            for (int i = n - 1; i >= 0; i--) {
                // Determine the current value of a[i] taking previous flips into account
                long currentValue = (flipCount % 2 == 1) ? -a[i] : a[i];

                // If the element is negative, we must flip the prefix up to i
                if (currentValue < 0) {
                    ops.add(i + 1); // 1-based index
                    flipCount++;
                }
            }

            // Print the total number of operations
            sb.append(ops.size()).append("\n");
            
            // Print the indices used
            for (int i = 0; i < ops.size(); i++) {
                sb.append(ops.get(i));
                if (i < ops.size() - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
