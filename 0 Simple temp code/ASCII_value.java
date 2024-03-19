import java.util.*;
public class ASCII_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any aplhabet"); 
        char character=sc.next().charAt(0);
              
        int result=(int)character;
       // System.out.println(result);



       if(result>=97 && result<=122){
         
        System.out.println("you have enter lowe case");
       }else if(result>=65 && result<=90){
        System.out.println("you have Enter upper case");
       }else{
        System.out.println("you have enter wrong key");
       }
    }

    
}
