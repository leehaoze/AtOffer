public class 二叉搜索树的第k个结点 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private static int n = 0;
    private static TreeNode ans = null;

    private static int count = 0;

    static TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot != null) {
            TreeNode node = KthNode(pRoot.left, k);
            if (node != null) return node;
            if (++count == k) return pRoot;
            node = KthNode(pRoot.right, k);
            if (node != null) return node;
        }
        return null;
    }


    static void printKthNode(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            printKthNode(root.left, k);
        }
        n++;
        if (n == k) {
            ans = root;
            return;
        }
        if (root.right != null)
            printKthNode(root.right, k);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(6);
        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(9);
        TreeNode g = new TreeNode(11);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        System.out.println(KthNode(a, 1).val);
    }

}
