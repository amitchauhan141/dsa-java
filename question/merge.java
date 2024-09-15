public class merge {
    public static void mergeSort(int arr[],int si,in ei){
        if(si>=ei){
            return;
        }
        int mid = si +(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
    }
    //merge method to sorted parts
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]= new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k =0;
        while(i<=mid && j<=ei){
            if(arr[i]< arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for leftoverelement of 1 st sorted part
        while(i<)
    }
    public static void main(String[] args) {
        
    }
}
