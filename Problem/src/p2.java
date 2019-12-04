/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans_1 = l1;
        ListNode ans_2 = l2;
        int len1 = 0;
        int len2 = 0;
        while (l1!=null){
            len1++;
            l1 = l1.next;
        }
        while (l2!=null){
            len2++;
            l2 = l2.next;
        }
        l1 = ans_1;
        l2 = ans_2;
        if (len1>len2){
            while (l2!=null){
                l1.val+=l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            l1 = ans_1;
            while (l1!=null) {
                if (l1.val >= 10 && l1.next!=null) {
                    l1.val -= 10;
                    l1.next.val++;
                }
                if(l1.val >=10 && l1.next==null) {
                    l1.val -= 10;
                    l1.next = new ListNode(1);
                }
                l1 = l1.next;
            }
            return ans_1;
        }
        else if(len1 < len2) {
            while (l1!=null){
                l2.val+=l1.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            l2 = ans_2;
            while (l2!=null) {
                if (l2.val >= 10 && l2.next!=null) {
                    l2.val -= 10;
                    l2.next.val++;
                }
                if(l2.val >=10 && l2.next==null) {
                    l2.val -= 10;
                    l2.next = new ListNode(1);
                }
                l2 = l2.next;
            }
            return ans_2;
        }
        else {
            while (l2!=null){
                l1.val+=l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            l1 = ans_1;
            while (l1!=null) {
                if (l1.val >= 10 && l1.next!=null) {
                    l1.val -= 10;
                    l1.next.val++;
                }
                if(l1.val >=10 && l1.next==null) {
                    l1.val -= 10;
                    l1.next = new ListNode(1);
                }
                l1 = l1.next;
            }
            return ans_1;
        }
    }
}