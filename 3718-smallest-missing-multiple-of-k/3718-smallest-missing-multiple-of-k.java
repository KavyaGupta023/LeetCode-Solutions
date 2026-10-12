class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] arr=new boolean[101];
        for(int num:nums){
            arr[num]=true;
        }
        for(int i=k; ; i+=k){
            if(i>100 || ! arr[i]){
                return i;
            }
        }
    }
}