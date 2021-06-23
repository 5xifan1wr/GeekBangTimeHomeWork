class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode nbsp = head;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                nbsp.next = l1;
                nbsp = nbsp.next;
                l1 = l1.next;
            }else{
                nbsp.next = l2;
                nbsp = nbsp.next;
                l2 = l2.next;
            }
        }
        nbsp.next=(l1==null)?l2:l1;
        return head.next;
    }
}