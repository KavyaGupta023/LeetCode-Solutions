class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int pr1=1;
        int pr2=2;
        for(int i=3;i<=n;i++){
            int curr=pr2+pr1;
            pr1=pr2;
            pr2=curr;
        }
        return pr2;
    }
}