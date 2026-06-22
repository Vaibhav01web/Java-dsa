import java.util.*;
public class simplesort {
    public static int search(int t, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==t){
                return (i+1);
                }
            else 
                System.out.println("Target not found");          
        }
         return search(t, arr);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element "+(i+1)+":");
            arr[i]=sc.nextInt();
            }
        System.out.println("Enter Target Element:");
        int target = sc.nextInt();
        System.out.println("Position of target Element is :" );
        System.out.println( search(target, arr));

    }
}
