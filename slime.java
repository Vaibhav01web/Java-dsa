import java.util.Scanner;
import java.util.Arrays;

public class slime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            // Minimum operations = ceil((max - min) / 2)
            int ans = (a[n - 1] - a[0] + 1) / 2;

            System.out.println(ans);
        }

        sc.close();
    }
}