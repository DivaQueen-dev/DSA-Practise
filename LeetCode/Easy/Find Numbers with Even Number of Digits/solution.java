class Solution {
    public static int countdigi(int num)
    {
        int count=0;
        while(num>0)
        {
            int digi=num%10;
            count++;
            num/=10;
        }
        return count;
    }
    int count=0;
    public int findNumbers(int[] nums) {
        for(int num:nums)
        {
            if(countdigi(num)%2==0)
            {
            count++;
            }
        }
        return count;
    }
}