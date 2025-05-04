class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        
        if(pivot == -1){
            reverse(arr,0,n-1);
            return;
        }
        
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,pivot,i);
                break;
            }
        }
        
        reverse(arr,pivot+1,n-1);
        
    }
    private void reverse(int arr[],int start,int end){
            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        
        private void swap(int arr[], int num1, int num2){
            int temp=arr[num1];
            arr[num1]=arr[num2];
            arr[num2]=temp;
        }
}