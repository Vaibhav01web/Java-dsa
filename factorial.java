import java.util.*;
public class factorial {
    public static int fact(int n){
        if (n==0) {
            return 1;
            
        }
        else if(n<0){
            System.out.println("Factorial doesnt exists");
        }
        else {
            return n*fact(n-1);
        }

        return fact(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter number :");
        int n = sc.nextInt();
         
        int c = fact(n);
        System.out.println("Factorial is :");
        System.out.println(c);
        sc.close();

    }
}
