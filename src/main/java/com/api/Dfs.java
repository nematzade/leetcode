package com.api;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/description/">...</a>
 */
public class Dfs {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }

    /**
     * <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/?envType=problem-list-v2&envId=depth-first-search">...</a>
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        postorder(root, list);

        return list;
    }

    public void postorder(TreeNode node, List<Integer> list) {
        if (node == null) return;
        postorder(node.left, list);
        postorder(node.right, list);
        list.add(node.val);
    }

    /**
     * <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/?envType=problem-list-v2&envId=depth-first-search">...</a>
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        preorder(root, list);

        return list;
    }

    public void preorder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }
}
