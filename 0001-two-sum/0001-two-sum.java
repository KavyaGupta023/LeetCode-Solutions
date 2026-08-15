class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(map.keySet().contains(x)){
                a[0]=map.get(x);
                a[1]=i;
            }
            else
            map.put(nums[i],i);
        }
        return a;
    }
}