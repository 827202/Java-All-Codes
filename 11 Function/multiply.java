import java.util.*;
public class multiply {
    public static int multiply_number(int a,int b){
        int product=a*b;
        return product;


        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your number1");
        int a=sc.nextInt();
        System.out.println("Enter your number2");
        int b=sc.nextInt();

       int product= multiply_number(a,b);
       System.out.println("your product:" +product);

        
    }
    
}
