class Solution {
    public int[] searchRange(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]== target){
                return i;
            }
        }
    public static void main(String ags[]){
        int target = 8;
        int nums[] = {5,7,7,8,8,10};
        System.out.println(searchRange(nums,target));
     }   
    }
}