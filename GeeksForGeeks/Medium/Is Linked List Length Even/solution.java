/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
        // code here
        Node curr= head;
                int count=0;
                while(curr!=null)
                {
                    count+=1;
                    curr=curr.next;
                }
                if(count%2==0)
                {
                    return true;
                }
                return false;
        
    }
}