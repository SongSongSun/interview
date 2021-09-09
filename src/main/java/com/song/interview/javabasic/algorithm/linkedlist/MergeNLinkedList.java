package com.song.interview.javabasic.algorithm.linkedlist;

import java.util.PriorityQueue;

/**
 * @Author Song
 * @Date 2021/9/9 22:47
 * @Version 1.0
 * @Description leetcode 23
 * 给你一个链表数组，每个链表都已经按升序排列。
 * <p>
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 */
public class MergeNLinkedList {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();
        ListNode p = dummy;
        if (lists == null || lists.length < 1) {
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> (a.val - b.val));
        for (ListNode head : lists) {
            if (head != null) {
                pq.offer(head);
            }
        }
        while (!pq.isEmpty()) {
            ListNode poll = pq.poll();
            p.next = poll;
            if (poll.next != null) {
                pq.offer(poll.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}
