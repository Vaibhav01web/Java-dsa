import java.util.Scanner;


public class pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of rows  :");
        int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         System.out.print("*");

        //         // System.out.println("\n");
        //     }
        //     System.out.print("\n");
            
            
        //  }
        // for (int u = 1; u <= n; u++) {
        //     for (int v = 1; v <= u; v++) {
        //         System.out.print("*");

        //         // System.out.println("\n");
        //     }
        //     System.out.print("\n");
            
            
        // }
        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++) {
                if(u==0||v==n-1||u==n-1||v==0){
                System.out.print("*");
                }
                else
                     System.out.print(" ");

                // System.out.println("\n");
            }
            System.out.print("\n");
    }
}
}