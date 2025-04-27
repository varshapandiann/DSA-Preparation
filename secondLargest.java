class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length<2){
            return -1;
        }
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num : arr){
            if(num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }
            else if(num>secondLargest && num != firstLargest){
                secondLargest=num;
            }
        }
        return secondLargest != Integer.MIN_VALUE ? secondLargest : -1;
    }
}