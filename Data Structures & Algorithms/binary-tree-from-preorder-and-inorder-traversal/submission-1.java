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
    int pre_idx=0;
    HashMap<Integer,Integer> hm=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }

        return DFS(preorder,0,preorder.length-1);
    }

    public TreeNode DFS(int[] preorder,int l,int r){
        if(l>r){return null;}
        int root_val=preorder[pre_idx++];
        TreeNode root = new TreeNode(root_val);
        int mid=hm.get(root_val);
        root.left=DFS(preorder,l,mid-1);
        root.right=DFS(preorder,mid+1,r);
        return root;


    }
}
