import java.util.Scanner;

public class myjava {
    public static double avgNum(int a,int b,int c){
        int sum = a+b+c;
        double avg = sum/3.0;
        return avg;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("the avg of three number is"+ avgNum(a, b, c));

        
        
    }
}
