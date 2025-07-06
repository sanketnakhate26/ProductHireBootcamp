package com.bootcamp.day006;

public class ProductHire_01_ReverseListOptimized {
    public static void main(String[] args) {
        ListNode head = ProductHire_01_ReverseListBrute.createList(new int[]{1, 2, 3, 4, 5});
        head = reverseList(head);
        ProductHire_01_ReverseListBrute.printList(head);
    }

    static ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}