class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        
        
        ListNode temp1=head, temp2=head.next;
        temp1.next=swapPairs(head.next.next);
        temp2.next=temp1;
        return temp2;
    }
}