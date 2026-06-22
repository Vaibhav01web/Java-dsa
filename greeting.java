import java.util.*;
public class greeting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("press button 1,2 or 3 : ");
        int a = sc.nextInt();
        switch (a){
            case 1 :{
                System.out.println("hello");
                break;

            }
            case 2 :{
                System.out.println("namaste");
                break;
            }
            case 3 :{
                System.out.println("bonjour");
                break;
            }
            default : 
            {
                System.out.println("Invalid button");
            }
        }sc.close();
    }
    
}