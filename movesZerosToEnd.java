class Solution {
    void pushZerosToEnd(int[] arr) {
        int nonZeroIndex=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroIndex++]=arr[i];
            }
        }
        while(nonZeroIndex<arr.length){
            arr[nonZeroIndex++]=0;
        }
    }
}