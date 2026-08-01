class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        class Item{
            int value ;
            int weight;
          double ratio;
            Item(int value , int weight){
                this.value=value;
                this.weight=weight;
                this.ratio=(double)value/weight;
            }
        }
        // code here
         int n=val.length;
         Item[] items=new Item[n];
         for(int i=0;i<n;i++){
          items[i]=new Item(val[i],wt[i]);
         }
         Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
         double profit=0.0;
         for(int i=0;i<n;i++){
             if(items[i].weight<=capacity){
                 profit+=items[i].value;
                 capacity-=items[i].weight;
             }
             else{
                 profit+=items[i].ratio*capacity;
                 break;
             }
         }
         return profit;
    }
}