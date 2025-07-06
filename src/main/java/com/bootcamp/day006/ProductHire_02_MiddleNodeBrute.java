package com.bootcamp.day006;

public class ProductHire_02_MiddleNodeBrute {
    public static void main(String[] args) {
        ListNode head = ProductHire_01_ReverseListBrute.createList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode mid = findMiddle(head);
        System.out.println("Middle Node: " + mid.val);
    }

    static ListNode findMiddle(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int mid = count / 2;
        curr = head;
        for (int i = 0; i < mid; i++) curr = curr.next;
        return curr;
    }
}
