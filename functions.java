import java.util.*;
public class functions {
    public static int Add( int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number :");
        int b= sc.nextInt();
        
        int c = Add(a, b);
        System.out.println("Sum is :");
        System.out.println(c);
        sc.close();
    }
    
}
