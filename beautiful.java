import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class beautiful {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());
        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            String s = br.readLine();
            int n = s.length();
            int onesAndThreesRight = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '1' || ch == '3') {
                onesAndThreesRight++;
               }
            }
            int twosLeft = 0;
            int maxBeautifulLen = onesAndThreesRight; 
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '2') {
                    twosLeft++;
                } else if (ch == '1' || ch == '3') {
                    onesAndThreesRight--;
                }
                int currentLen = twosLeft + onesAndThreesRight;
                if (currentLen > maxBeautifulLen) {
                    maxBeautifulLen = currentLen;
                }
            }    
            int minRemovals = n - maxBeautifulLen;
            output.append(minRemovals).append("\n");
        }
        System.out.print(output);
    }
}