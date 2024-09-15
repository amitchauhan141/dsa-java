import java.util.Scanner;

public class codejava {
    public static boolean checkEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isEven = checkEven(n);
        System.out.println("Is the number even? " + isEven);
        
    }
}
