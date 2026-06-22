import java.util.*;
public class toodarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int[][] Matrix = new int[i][j];
        for(int v = 0; v<i;v++){
            for (int u = 0; u<j;u++){
                Matrix[v][u]=sc.nextInt();
                
            }
        }
        System.out.println("Hey Vaibhav");
        for(int v = 0; v<i;v++){
            for (int u = 0; u<j;u++){
                System.out.print(Matrix[v][u]);
                
                
            }
        }
    }
}