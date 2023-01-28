/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        boolean rev=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> c=new ArrayList<>();
            for(int i=1;i<=size;i++){
                TreeNode cur=q.poll();
                c.add(cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            if(rev){
                Collections.reverse(c);
            }
            rev=!rev;
            res.add(c);
        }
        return res;
    }
}
