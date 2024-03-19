public class Binary_To_Decimal {

    public static void bintodec(int n){
        int mynum=n;
        int pow=0;
        int dec=0;
        if(n>0){
            int lastDigit=n%10;
            dec=dec+(lastDigit * (int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(dec);

    }
    public static void main(String[] args) {
        
    bintodec(101);
        
    }
    
}
