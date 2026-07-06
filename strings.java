import java.util.*;
public class strings {
    public static void main(String args[]){
        // String fname = "Vaibhav";
        // String lname = "Don";
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("name is : " +name);
        // String fullname = fname + " " + lname;
        // System.out.println("name is : " +fullname);
        // System.out.println(fullname.length());
        // for (int i = 0; i < fullname.length(); i++) {
        //     System.out.println(fullname.charAt(i));
            
        // }
        String fname = "Vaibhav";
        String gname = "Waibhav";
        if (fname.compareTo(gname)==0) {
            System.out.println("both are equal");
            

            
        }
        else if (fname.compareTo(gname)<0) {
            System.out.println("fname comes alphabetically first");
            
        } 
        else {
            System.out.println("gname comes alphabetically first");
            
        }
    }
}
