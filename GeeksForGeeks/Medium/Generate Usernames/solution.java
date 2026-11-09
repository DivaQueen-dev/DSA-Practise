class Solution {
    public ArrayList<String> generateUsernames(String[] arr) {
        // code here
        HashMap<String,Integer> hash=new HashMap<>();
           HashSet<String> set=new HashSet<>();
           ArrayList<String> ans=new ArrayList<>();



           for(String t:arr)
               set.add(t);
           for(int i=0;i<arr.length;i++)
           {
               if(!set.add(arr[i]) && hash.containsKey(arr[i]))
                 {
                     String temp=arr[i];
                   while(!set.add(temp))   {
                       temp=arr[i];
                       temp+=hash.get(arr[i]);
                       hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
                   }  

                   ans.add(temp);


                 }
                 else
                 {
                     ans.add(arr[i]);
                                     hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);


                 }



           }
           return ans;
    }
}