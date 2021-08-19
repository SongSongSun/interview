package com.song.interview.javabasic.algorithm.backtrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Song
 * @Date 2021/8/17 16:10
 * @Version 1.0
 * @Description 全排列问题   leetcode 46. 全排列  使用回溯算法框架解题
 */
public class FullArraySolution {
    private List<List<Integer>> solution;

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> tack = new LinkedList<>();
        solution = new LinkedList<>();
        backTrack(nums, tack);
        return solution;
    }

    public void backTrack(int[] nums, List<Integer> tack) {
        if (tack.size() == nums.length) {
            solution.add(new LinkedList<>(tack));
            return;
        }
        for (int num : nums) {
            if (!tack.contains(num)) {
                tack.add(num);
                backTrack(nums, tack);
                tack.remove(tack.size() - 1);
            }
        }
    }
}
