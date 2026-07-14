class Solution {
    public long factorSum(int N) {
        long sum=0;
        for(int i= 1 ; i*i<=N; i++)
        {
            if(N%i==0)
            {
                sum+=i;
            if(i!=N/i)
            {
              sum+=N/i;  
            }
            
            }
        }
        return sum;
    }
}