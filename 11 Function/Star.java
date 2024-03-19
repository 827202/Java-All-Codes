public class Star {
    
    public static void star(){
        //code in function class;
        int a=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;

            }
            System.out.println();
        }
        return;//it is the null return because we use void in the function. if we use int then we will use another return type.
        
        

    }
    public static void main(String[] args) {
        star();//Function call
        
    }
    
}
