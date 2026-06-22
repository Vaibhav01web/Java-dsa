import java.util.*;

public class picnic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = 0;

            if (3 * a >= b && 2 * a < b) {

                result = ((n / 3) * b) + ((n % 3) * a);

            } 
            else if (2 * a >= b && a < b) {

                if (n % 3 == 2) {

                    result = ((n / 3) * b) + b;

                } 
                else {

                    result = ((n / 3) * b) + a;
                }

            } 
            else if (a >= b) {

                result = ((n / 3) * b) + b;

            } 
            else {

                result = n * a;
            }

            System.out.println(result);
        }

        sc.close();
    }
}