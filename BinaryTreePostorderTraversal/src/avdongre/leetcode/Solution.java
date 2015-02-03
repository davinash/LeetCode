package avdongre.leetcode;


/*******************************************************************************
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].

*******************************************************************************/
		
		
public class Solution {
	public void postorderTraversal(TreeNode root, java.util.List<Integer>  result) {
	if ( root == null) {
		return;
	}		
	postorderTraversal( root.left , result);
	postorderTraversal( root.right, result); 

	result.add(root.val);
}


public java.util.List<Integer> postorderTraversal(TreeNode root) {		
	java.util.List<Integer> result = new java.util.ArrayList<Integer>();
	postorderTraversal(root, result);
	return result;

}

}