class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        quickS(arr,low,high);
    }
    public void quickS(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int partitionIdx=partition(arr,low,high);
        quickS(arr,low,partitionIdx-1);
        quickS(arr,partitionIdx+1,high);
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            
            }
            
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
        
    }
}