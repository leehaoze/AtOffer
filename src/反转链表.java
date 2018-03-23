public class 反转链表 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = null, now = null, next = null;
        pre = head;
        head = head.next;
        pre.next = null;
        while (head != null) {
            if (head != null) {
                now = head;
            }
            if (now != null && now.next != null) {
                next = now.next;
            }
            else{
                next = null;
            }
            now.next = pre;
            pre = now;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode head = ReverseList(l1);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

}
