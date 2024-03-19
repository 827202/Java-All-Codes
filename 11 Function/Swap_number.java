public class Swap_number {
    public static void Swap(int a,int b){
       
        //Swap code
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);// call by value condition if we write this in main.
        System.out.println(b);// c
       
    }
    public static void main(String[] args) {
         int a=5;
        int b=10;
        Swap(a,b);
        
        
       
        
    }
    
}
