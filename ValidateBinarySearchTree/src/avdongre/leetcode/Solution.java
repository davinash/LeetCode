package avdongre.leetcode;

public class Solution {
	java.util.ArrayList<Integer> arr = new java.util.ArrayList<Integer>();

	private void performInorder(TreeNode root) {
		if ( root == null) {
			return;
		}
		performInorder(root.left);
		arr.add(root.val);
		performInorder(root.right);
	}

	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		performInorder(root);
		int previous = arr.get(0).intValue();
		
		for (int i = 1 ; i < arr.size();i++) {
			int current = arr.get(i).intValue(); 
			if (current <= previous) {
				return false;
			}
			previous = current;
		}
		return true;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		{
			TreeNode tn1 = new TreeNode(1);
			TreeNode tn2 = new TreeNode(1);
			tn1.left = tn2;
			System.out.println(s.isValidBST(tn1));
		}		
		
		{
			TreeNode tn5  = new TreeNode(5);
			TreeNode tn14 = new TreeNode(14);
			TreeNode tn1  = new TreeNode(1);
			
			tn5.left = tn14;
			tn14.left = tn1;
			
			System.out.println(s.isValidBST(tn5));
		}		
		
		{
			System.out.println(s.isValidBST(null));
		}
		
	}

}
