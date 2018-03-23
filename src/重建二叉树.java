import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;

public class 重建二叉树 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode( int x) {
            val = x;
        }
    }


    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if(pre.length == 0){
            return null;
        }
        if(pre.length == 1){
            return new TreeNode(pre[0]);
        }
        TreeNode root = new TreeNode(pre[0]);
        int left_node_count = 0;
        for(int i = 0; i < in.length; ++i){
            if(in[i] == pre[0]){
                left_node_count = i;
                break;
            }
        }
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,left_node_count+1), Arrays.copyOfRange(in,0,left_node_count));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,left_node_count+1,pre.length), Arrays.copyOfRange(in,left_node_count+1,in.length));
        return root;
    }

    //精简代码
    public static TreeNode reConstructBinaryTree2(int[] pre, int[] in) {
        if (pre.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for(int i = 0; i < in.length; ++i){
            if(in[i] == pre[0]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1), Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length), Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }

    public static void main(String []args){
        int []pre = {1,2,4,7,3,5,6,8};
        int []in = {4,7,2,1,5,3,8,6};
        TreeNode node = reConstructBinaryTree(pre,in);
    }

}
