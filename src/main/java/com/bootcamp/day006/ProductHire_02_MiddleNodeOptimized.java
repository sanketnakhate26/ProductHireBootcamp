package com.bootcamp.day006;

public class ProductHire_02_MiddleNodeOptimized {
    public static void main(String[] args) {
        ListNode head = ProductHire_01_ReverseListBrute.createList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode mid = findMiddle(head);
        System.out.println("Middle Node: " + mid.val);
    }

    static ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
