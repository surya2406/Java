class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int count=1;
        Node curr=head;
        while(curr.next!=null)
        {
            count++;
            curr=curr.next;
        }
        if(count%2==0) return true;
        return false;
    }
}
