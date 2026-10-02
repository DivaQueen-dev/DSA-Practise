class Solution {
    public static String reverseString(String s) {
        // code here
         char [] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}