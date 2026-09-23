class Solution {
    public int dominantPairs(int[] arr) {
        // Code here
        int n=arr.length;
        int mid=n/2;
        Arrays.sort(arr,0,mid);
        Arrays.sort(arr,mid,n);
        int i=0;
        int j=mid;
        int c=0;
        while(i<mid&&j<n){
            if(arr[i]>=5*arr[j]){
                c+=mid-i;
                j++;
            }else{
                i++;
            }
        }
        return c;
    }
}