import java.util.ArrayList;
import java.util.Collections;

public class 按之字形顺序打印二叉树 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private static ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();

    static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot != null) {
            addData(pRoot, 0);
        }
        for(int i = 0; i < data.size(); ++i){
            if(i % 2 != 0){
                Collections.reverse(data.get(i));
            }
        }
        return data;
    }

    static void addData(TreeNode pRoot, int deep) {
        if (data.size() <= deep) {
            data.add(new ArrayList<Integer>());
        }
        data.get(deep).add(pRoot.val);
        if (pRoot.left != null) {
            addData(pRoot.left, deep + 1);
        }
        if (pRoot.right != null) {
            addData(pRoot.right, deep + 1);
        }
    }

    public static void main(String[] args) {
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
        ArrayList<ArrayList<Integer>> ans = Print(a);
        for (ArrayList<Integer> arrayList : ans) {
            for (Integer integer : arrayList) {
                System.out.print(integer);
            }
            System.out.println("");
        }
    }

}
