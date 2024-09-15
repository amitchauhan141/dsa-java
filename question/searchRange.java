public class searchRange {
    public static void Range(int nums[],int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]== target){
                return i;
            }else{
                return -1;
            }

        }
    
    }
    public static void main(String[] args) {
        int target = 2;

        int nums[] = {1,2,2,3};
        Range(nums, target);


        
    }
}
