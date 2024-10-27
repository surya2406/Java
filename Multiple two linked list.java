class Solution {
    private static final long MOD = 1000000007;
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        Long list1=linkedListToNumber(first);
        Long list2=linkedListToNumber(second);
        return (list1 * list2)%MOD;
        
    }
    private long linkedListToNumber(Node head)
    {
        long num=0;
        Node current=head;
        while(current!=null)
        {
            num=(num*10+current.data)%MOD;
            current=current.next;
        }
        return num;
    }
}
