class Solution {
    public static int count(Node head, int key) {
        // code here
        int count=0;
        Node curr=head;
        while(curr!=null)
        {
            if(curr.data==key) count++;
        curr=curr.next;
        }
        return count;
    }
}
