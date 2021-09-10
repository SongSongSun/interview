package com.song.interview.javabasic.algorithm.ReverseLinkedList;


/**
 * @Author Song
 * @Date 2021/9/2 17:30
 * @Version 1.0
 * @Description
 */
public class ReverseLinkedListTest {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        node.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        Node root = node;
        while (root != null) {
            System.out.print(root.getValue()+",");
            root = root.getNext();
        }
        System.out.println();
        Node root1 = node;
        while (root1 != null) {
            System.out.print(root1.getValue()+",");
            root1 = root1.getNext();
        }
        System.out.println();
        Node list = reverseList(node);
        while (list != null) {
            System.out.print(list.getValue()+",");
            list = list.getNext();
        }

    }


    public static Node reverseList(Node head) {
        Node root = head;
        Node pre = null;
        Node next = null;
        while (root != null) {
            next = root.getNext();
            root.setNext(pre);
            pre = root;
            root = next;
        }
        return pre;
        /*Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }
        return pre;*/
    }
}
