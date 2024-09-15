import java.util.Scanner;

public class javabasic {
    public static int findproduct(int a,int b){
        int product = a*b;
        return product;
    }
    public static int findFactorial(int n){
        int f =1;
        for(int i=1; i<=n; i++){
             f = f*i;
        }
        return f;
        
    }
    public static int Bincoff(int n, int r){
        int fact_n = findFactorial(n);
        int fact_r = findFactorial(r);
        int fact_nmr= findFactorial(n-r);

        int Bincoff = fact_n / (fact_r * fact_nmr);
        return Bincoff;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b ,float c){
        return a+b+c;

    }
    public static boolean isPrime( int n){

        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //primein range
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    // binary to decimal conversion
public static void bintodec(int binNum) {
    int decNum = 0;
    int pow = 0;
    int originalBinNum = binNum; // store the original binNum value

    while (binNum > 0) {
        int lastdigit = binNum % 10;
        decNum = decNum + (lastdigit * (int)Math.pow(2, pow));
        pow++;
        binNum = binNum / 10;
    }
    System.out.println("decimal of " + originalBinNum + " = " + decNum);
}
//decimal to binary conversion
public static void dectobin(int n){
    int myNum =n;
    int pow = 0;
    int binNum =0;
    while(n>0){
        int rem = n%2;
        binNum= binNum + (rem*(int)Math.pow(10,pow));
        pow++;
        n=n/2;

    }
    System.out.println("binary  of " + myNum + " = " + binNum);
}




public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    dectobin(n);
    }
}