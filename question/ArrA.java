public class ArrA{
    public static void MaxSubarray(int numbers[]) {//maxsubarray sum using brute force
        
        int currSum=0;
        int Maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                 currSum=  0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(Maxsum<currSum){
                    Maxsum=currSum;
                }
                
                
            }
            
        }
        System.out.println("the maximum sum is"+Maxsum);

    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5};
        // PrintSubarray(numbers);
        MaxSubarray(numbers);
    }
}
