public class ArrTR {
    public static int trappedwater(int heights[]){
        int n = heights.length;
        //calculate left max boundry
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(heights[i],leftMax[i-1]);
        }
        //calculate right max boundry
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i= n-2; i>=0; i--){
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }
        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++){
            //waterlevel = min(leftmaxbound,rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //trapped Water = waterlevel - height[i]
            trappedwater+= waterLevel-heights[i];
        }
        return trappedwater;

    }
    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5};
        System.out.println(trappedwater(heights));
    }
}
