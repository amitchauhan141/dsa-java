public class ArrayAA {
    public static int Linearsearch(int number[],int key){
        for(int i=0; i<=number.length;i++){
            if(number[i]==key){
                return i; 
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int number[] = {3,4,6,7,8,9,10,12};
        int key =10;
        int index = Linearsearch(number, key);
        if(index == -1){
            System.out.println("key not found ");
        }else{
            System.out.println("key found at index: "+ index);
        }
    }
}
