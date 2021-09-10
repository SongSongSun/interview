package com.song.interview.javabasic.algorithm.ReverseLinkedList;

/**
 * @Author Song
 * @Date 2021/9/2 17:31
 * @Version 1.0
 * @Description
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
