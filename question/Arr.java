public class Arr{
    public static void MaxSubarraysum(int numbers[]) {//maxsub array sum using prefix method
        int currSum=0;
        int Maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0]= numbers[0];
        for(int i=1; i<prefix.length;i++){
            prefix[i]= prefix[i-1]+numbers[i];
        }


        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
             currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];    
                if(Maxsum<currSum){
                    Maxsum=currSum;
                }
                
                
            }
            
        }
        System.out.println("the maximum sum is"+Maxsum);

    }
    public static void Kadnessalgo(int numbers[]){
        int cs=0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs= cs +numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms= Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is"+ms);
    }

    public static void main(String[] args) {
        int numbers[] = {4,2,0,6,3,2,5};
        // PrintSubarray(numbers);
        // MaxSubarraysum(numbers);
        Kadnessalgo(numbers);
        
    }
}
