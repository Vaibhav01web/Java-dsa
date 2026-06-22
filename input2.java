import java.util.Scanner;
public class input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of contestants: ");
        int n = sc.nextInt();
        int max=0;
        int winner=0;
        int arr[] = new int[n];
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for contestant " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            // max = arr[0];
           if (arr[i] > max) {
                max = arr[i];
                winner=i+1;
            }
            
            
        }
         System.out.println("Maximum score is: " + max+" by contestant " + winner);
    // System.out.println(max+i);
}
}