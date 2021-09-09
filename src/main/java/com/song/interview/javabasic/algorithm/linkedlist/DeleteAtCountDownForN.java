package com.song.interview.javabasic.algorithm.linkedlist;

/**
 * @Author Song
 * @Date 2021/9/9 23:08
 * @Version 1.0
 * @Description leetcode 第19题
 * 你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class DeleteAtCountDownForN {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = new ListNode();
        ListNode p2 = new ListNode();
        p1 = dummy;
        p2 = dummy;
        for (int i = 0; i < n + 1; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return dummy.next;
    }
}
