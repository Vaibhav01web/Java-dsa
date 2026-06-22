import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of contestants: ");
        int n = sc.nextInt();
        System.out.println("Number of contestants: " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println("Contestant " + i);
        }

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        

        System.out.println("Your age is: " + age);
        if (age>=18) {
            System.out.println("You are an adult.");
            
        } else {
            System.out.println("You are not an adult.");
        }

        sc.close();
    }
}