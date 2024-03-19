import java.util.*;
public class Sum {
    public static int CalculateSum(int num1, int num2){// parameters & formal parameters
        int sum=num1+num2;
       
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a=sc.nextInt();
        System.out.println("Enter your Second number");
        int b=sc.nextInt();
        int sum= CalculateSum(a,b);//Arguments & Actual parameters
        
        System.out.println("Sum is :" +sum);
        
        
    }
    
}
