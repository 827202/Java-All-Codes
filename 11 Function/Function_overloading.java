public class Function_overloading {
    //Finction overloading using parameters.
    // if function overloading retuen type is same then it give error.
    public static int sum(int a,int b){
        return a+b;
    }
     public static int sum(int a,int b ,int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
      System.out.println(sum(5,6));
      System.out.println(sum(5,6,7));
        
        
    }
    
    
}
