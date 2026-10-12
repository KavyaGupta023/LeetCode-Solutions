class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int sum=0;
        int num=n;    
        while(n!=0){
            s+=(n%10);
            p*=(n%10);
            n/=10;
        }
         sum=s+p;

        if(num % sum  ==0)
        return true;

        return false;

    }
}