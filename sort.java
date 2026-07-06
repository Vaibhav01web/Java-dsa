import java.util.Scanner;

public class sort {

    // taking input in array
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] youu = new int[n];
        for (int i = 0; i < youu.length; i++) {
            youu[i]=sc.nextInt();
            
        }
        // applying sort algorithm
        for (int i = 0; i < youu.length-1; i++) {
            for(int j = 0 ;j<youu.length-i-1;j++){
                if(youu[j]>youu[j+1]){
                int temp = youu[j];
                youu[j]=youu[j+1];  
                youu[j+1]= temp;              
                }
        }
        }
        for (int i = 0; i < youu.length; i++) {
            System.out.print(youu[i]+" ");
            
        }

    }
    
}
