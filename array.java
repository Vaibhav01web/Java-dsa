import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter  "+(i+1) + "th "+"element");

    arr[i]=sc.nextInt();
    
} 
 for(int i = 0;i<n;i++)
{
    System.out.println(( i+1) + "st element is "+arr[i]);
}     }

    
}
