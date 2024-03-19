import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1=scn.nextInt();
         System.out.println("Enter the number2");
        int num2=scn.nextInt();
       
        System.out.println("Enter the operation & You can perform only + , - , * , / ");
        char operator=scn.next().charAt(0);
        switch(operator){
            case '+':System.out.println("your sum is :");
            System.out.print(num1+num2);
            break;
            case '-':System.out.println("your substract is :");
            System.out.print(num1-num2);
            break;
            case '*':System.out.println("your multiply is :");
            System.out.print(num1*num2);
            break;
            case '/':System.out.println("y0ur divide is :");
            System.out.print(num1/num2);
            break;
           
            default:System.out.println("you have entered wrong operation");
            
        }
        
    }
    
}
