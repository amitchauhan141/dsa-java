import java.util.Scanner;

public class ArrayCC {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("physic marks: "  +  marks[0]);
        System.out.println("chemistry marks:  "  + marks[1]);
        System.out.println("maths marks :" + marks[2]);
        
        // marks[2] = marks[2]+1;
        // System.out.println("chemistry marks: " + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("the percentage is"+percentage+"%");
    }
}
 