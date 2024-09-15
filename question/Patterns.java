import java.util.Scanner;

public class Patterns {
    public static void hollrec(int totrow,int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1; j<=totcol;j++){
                if(i==1||i==totrow||j==1||j==totcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_row_pyr(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //half pyramid number
    public static void inverte_number(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i-1; j++){
                System.out.print(" ");
            }for(int j=1; j<=1+n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //half pyramid
    public static void inverte_pyra(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=1+n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //floyds triangle

    public static void floyds_triangle(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    //0 and 1 triangle
    public static void zeroandonetri(int n){
        for(int i=1;i<=n; i++){
            for(int j=1;j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    //mirroe pattern
    public static void mirror_img(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=1+n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    //butterfly patern
    public static void butterfly_pattern(int n){
        for(int i=1; i<=n; i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int totrow = sc.nextInt();
        // int totcol = sc.nextInt();
        // hollrec(totrow, totcol);
        int n = sc.nextInt();
        // inverted_row_pyr(n);
        // inverte_pyra(n);
        // floyds_triangle(n);
        // butterfly(n);
        butterfly_pattern(n);
    }
}
