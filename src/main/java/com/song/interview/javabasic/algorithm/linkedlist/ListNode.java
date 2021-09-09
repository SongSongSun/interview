package com.song.interview.javabasic.algorithm.linkedlist;

/**
 * @Author Song
 * @Date 2021/9/9 22:41
 * @Version 1.0
 * @Description
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
