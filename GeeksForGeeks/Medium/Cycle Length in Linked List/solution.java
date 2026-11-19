/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node temp=head;

             HashMap<Node,Integer> map=new HashMap<>();
             int i=0;

             while(temp!=null){
                 if(map.containsKey(temp)){
                     return i-map.get(temp);
                 }
                 map.put(temp,i++);
                 temp=temp.next;
             }

             return 0;
    }
}