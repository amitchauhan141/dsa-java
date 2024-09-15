public class Bitmask {
    public static void oddoreven(int n){
        int bitmask =1;
        if((n&bitmask)== 0){
            System.out.println("it is even");
        }else{
            System.out.println("it is odd");
        }
    }
    public static void main(String[] args) {
        oddoreven(4);
    }
}
