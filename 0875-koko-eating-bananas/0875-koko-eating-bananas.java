class Solution {
    long func(int piles[],int mid){
        long s=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%mid==0)
            s+=piles[i]/mid;
            else
            s+=piles[i]/mid+1;
        }
        return (long)s;
    }
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length==1){
            if(piles[0]%h==0) return piles[0]/h;
            else
        return piles[0]/h+1;
          }
        Arrays.sort(piles);
        int n=piles.length;
        int left=1;
        int right=piles[n-1];
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            long x=func(piles,mid);
            if(x<=h){
            ans=mid;
            right=mid-1;
            }
            else{
            left=mid+1;       
         }
        }
        return ans;
    }
}