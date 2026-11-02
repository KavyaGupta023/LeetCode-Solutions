class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int num=nums[nums.length/2];
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=(Math.abs(num-nums[i]));
        }
        return s;
    }
}