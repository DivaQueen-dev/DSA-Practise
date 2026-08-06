/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
import java.util.*;

class Solution {

    class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair curr = q.remove();

            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }

            if (curr.node.left != null) {
                q.add(new Pair(curr.node.left, curr.hd - 1));
            }

            if (curr.node.right != null) {
                q.add(new Pair(curr.node.right, curr.hd + 1));
            }
        }

        for (int value : map.values()) {
            ans.add(value);
        }

        return ans;
    }
}