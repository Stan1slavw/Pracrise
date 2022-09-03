package leetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
////////////////////////////////////////////////////////////////////
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;

//////////////////////////////////////////////////////////////////
//          int counterLeft=0;
//          int counterRight=0;
//          if (root.left!=null){
//              counterLeft++;
//          }
//          if (root.right!=null){
//              counterRight++;
//          }
//          return counterLeft;
    }
}

//
public class Maximum_Depth_of_Binary_Tree {
    //    public static void main(String[] args) {
//        TreeNode node = new TreeNode(20, new TreeNode(7, new TreeNode(4, null, new TreeNode(6)), new TreeNode(9)),
//                        new TreeNode(35, new TreeNode(31, new TreeNode(28), null), new TreeNode(40, new TreeNode(38), new TreeNode(52))));
//
//        System.out.println(node.maxDepth(node));
//    }
}
