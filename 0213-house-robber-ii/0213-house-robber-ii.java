class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int ar1[]=new int[n-1];
        ar1[0]=nums[0];
        ar1[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n-1;i++){
            ar1[i]=Math.max(nums[i]+ar1[i-2],ar1[i-1]);
        }
        int ar2[]=new int[n-1];

        ar2[0]=nums[1];
        ar2[1]=Math.max(nums[1],nums[2]);
        for(int i=3;i<n;i++){
            ar2[i-1]=Math.max(nums[i]+ar2[i-3],ar2[i-2]);
        }
        return Math.max(ar1[n-2],ar2[n-2]);
    }
}