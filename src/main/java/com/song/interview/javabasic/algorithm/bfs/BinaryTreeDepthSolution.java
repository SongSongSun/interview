package com.song.interview.javabasic.algorithm.bfs;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * @Author Song
 * @Date 2021/8/17 16:37
 * @Version 1.0
 * @Description leetCode 111. 二叉树的最小深度  使用BFS算法框架
 */
public class BinaryTreeDepthSolution {
    public int minDepth(TreeNode root) {
        ArrayDeque<TreeNode> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(root);
        int step = 0;
        while (!arrayDeque.isEmpty()) {

            for (int i = 0; i < arrayDeque.size(); i++) {
                TreeNode poll = arrayDeque.poll();
                if (poll.left == null && poll.right == null) {
                    return step;
                }
                if (poll.left != null) {
                    arrayDeque.offer(poll.left);
                }
                if (poll.right != null) {
                    arrayDeque.offer(poll.right);
                }
            }
            step++;
        }
        return step;
    }
}
