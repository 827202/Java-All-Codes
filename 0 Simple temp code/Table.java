import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number what you want table ");
        int n=sc.nextInt();
        System.out.println("your table is:");
        for(int i=1;i<=10;i++){
           int result=n*i;
           
           
           System.out.println( +result);
        }
        
        
    }
    
}
