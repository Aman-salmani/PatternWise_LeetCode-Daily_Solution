class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0 ;
        int mid = 0;
        int high = n-1;
        int temp;
        while(mid<= high){
            if(arr[mid]==0){
                //swap low and mid//
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                //swap mid and high//
            temp = arr[high];
            arr[high] = arr[mid];
            arr[mid] = temp;
            high--;
            }
        }
    }
}