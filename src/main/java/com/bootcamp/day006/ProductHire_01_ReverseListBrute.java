package com.bootcamp.day006;
import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class ProductHire_01_ReverseListBrute {
    public static void main(String[] args) {
        ListNode head = createList(new int[]{1, 2, 3, 4, 5});
        head = reverseBrute(head);
        printList(head);
    }

    static ListNode reverseBrute(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }

        for (int i = nodes.size() - 1; i > 0; i--) {
            nodes.get(i).next = nodes.get(i - 1);
        }
        if (!nodes.isEmpty()) nodes.get(0).next = null;
        return nodes.isEmpty() ? null : nodes.get(nodes.size() - 1);
    }

    static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0), curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}

