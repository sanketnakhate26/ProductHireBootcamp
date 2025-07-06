package com.bootcamp.day006;

import java.util.HashSet;

public class ProductHire_03_DetectCycleBrute {
    public static void main(String[] args) {
        ListNode head = ProductHire_01_ReverseListBrute.createList(new int[]{1, 2, 3, 4, 5});
        head.next.next.next.next.next = head.next; // create cycle
        System.out.println("Has Cycle: " + hasCycle(head));
    }

    static boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) return true;
            visited.add(head);
            head = head.next;
        }
        return false;
    }
}