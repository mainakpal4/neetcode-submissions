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
    public List<List<Integer>> levelOrder(TreeNode root) {
      
        List<List<Integer>> ls=new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();
        q.add((root));

        // ls.add(new ArrayList<>(){root.val});

        while(!q.isEmpty()){
          List<Integer> sl=new ArrayList<>();
          

          for(int i=q.size();i>0;i--){
            TreeNode n=q.poll();
            if(n!=null){
              sl.add(n.val);
              q.add(n.left);
              q.add(n.right);
             
          }
        
        }
        if(sl.size()>0){
            ls.add(sl);
          }

    }

    return ls;
}}
