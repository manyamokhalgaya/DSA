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
    public TreeNode construct(TreeNode root, int val){
        if(root == null)return new TreeNode(val);
        if(root.val > val){
            root.left = construct(root.left , val);
        }else{
            root.right = construct(root.right, val);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] arr) {
        int n = arr.length;
        if(n == 0) return null;
        TreeNode root = new TreeNode(arr[0]);
        for(int i = 1; i < n; i++){
            construct(root, arr[i]);
        }
        return root;
    }
}