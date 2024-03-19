import java.util.*;
public class Atendence_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter your total classes: ");
        int total_classes =sc.nextInt();

        System.out.print("Enter your attended classes: ");
        int attended_classes=sc.nextInt();

        int result= (attended_classes*100)/total_classes;
        System.out.println( "Total attended percentage classes: " +result+ "%");
        if(result<75){
            System.out.print("you will not appear for give the Exames: ");

        }else{
            System.out.print("you allow for give the Exames.");
        }


    }
    
}
