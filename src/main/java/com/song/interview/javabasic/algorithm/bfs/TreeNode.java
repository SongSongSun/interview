package com.song.interview.javabasic.algorithm.bfs;

/**
 * @Author Song
 * @Date 2021/8/17 16:39
 * @Version 1.0
 * @Description
 */
public class TreeNode {
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
}
