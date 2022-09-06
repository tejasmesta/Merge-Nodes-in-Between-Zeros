class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        
        ListNode prev = dummy;
        
        ListNode cur = head;       
        
        while(cur!=null)
        {
            if(cur.val==0)
            {
                cur = cur.next;
                continue;
            }
            int sum = 0;
            while(cur!=null && cur.val!=0)
            {
                sum+=cur.val;
                cur = cur.next;
            }
            prev.next = new ListNode(sum);
            prev = prev.next;
        }
        
        return dummy.next;
    }
}
