import java.util.*;
public class picnic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
        long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long groupCost = Math.min(b, 3 * a);
            long result =
                    (n / 3) * groupCost
                    + Math.min((n % 3) * a, b);
                     System.out.println(result);
        }
        sc.close();
    }
}