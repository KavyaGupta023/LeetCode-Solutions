class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=(n-nums[i]);
        }
        return s;
    }
}