class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        merge(arr, l, r);
    }
    public void merge(int[] arr,int si,int ei){
        if(si==ei){
            return;
        }
        int mid=(si+ei)/2;
        merge(arr,si,mid);
        merge(arr,mid+1,ei);
        sort(arr,si,mid,ei);
    }
    public void sort(int[] arr,int si,int mid,int ei){
        int left=si;
        int right=mid+1;
        int[] ar=new int[ei - si + 1];
        int idx=0;
        while(left<=mid && right<=ei){
            if(arr[left]>arr[right]){
                ar[idx++]=arr[right];
                right++;
            }
            else if(arr[left]<arr[right]){
                ar[idx++]=arr[left];
                left++;
            }
            else{
                ar[idx++]=arr[left];
                ar[idx++]=arr[right];
                left++;
                right++;
            }
        }
        while(left<=mid){
            ar[idx++]=arr[left];
            left++;
        }
        while(right<=ei){
            ar[idx++]=arr[right];
            right++;
            
        }
       
        for(int i=si;i<=ei;i++){
            arr[i]=ar[i-si];
        }
    }
}