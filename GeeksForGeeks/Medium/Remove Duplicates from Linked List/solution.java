/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        HashSet<Integer> set = new HashSet<>();

              set.add(head.data);

              Node curr = head;


              while(curr.next != null){

                  if(!set.contains(curr.next.data)){

                     
                      set.add(curr.next.data);

                      curr = curr.next;
                  }

                  else{
                     
                      curr.next = curr.next.next;
                  }
              }

              return head;
            
    }
}