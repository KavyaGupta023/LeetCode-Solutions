class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int st=minutesToTest/minutesToDie+1;
        int cap=1;
        int pigs=0;
        while(cap<buckets){
            cap*=st;
            pigs++;
        }
        return pigs;

    }
}