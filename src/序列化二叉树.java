import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.tree.TreeNode;

public class 序列化二叉树 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    static String Serialize(TreeNode root) {
        String ans = "";
        if (root == null) {
            return "#";
        }
        ans += root.val;
        ans += ',' + Serialize(root.left);
        ans += ',' + Serialize(root.right);
        return ans;
    }

    private static int pos = 0;
    private static String[] data = null;

    static TreeNode Deserialize(String str) {
        if (data == null) {
            data = str.split(",");
        }
        if (data.length == 0 || pos >= data.length || data[pos].equals("#")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(data[pos]));
        ++pos;
        root.left = Deserialize(str);
        ++pos;
        root.right = Deserialize(str);
        return root;
    }

    public static void main(String args[]) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        d.right = i;
        System.out.println(Serialize(a));
        System.out.println(Serialize(Deserialize(Serialize(a))));
    }


}
