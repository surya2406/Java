

/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/

class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // code here
       if(head==null || head.next==head) return head;
       Node prev=null;
       Node current=head;
       Node next=null;
       Node last=head;
       do{
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }while(current!=head);
       head.next=prev;
       return prev;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        // code here
        Node current=head;
        Node prev=null;
        if(head.data==key)
        {
            while(current.next!=head)
            {
                current=current.next;
            }
            if(current==head)
            {
                return null;
            }
            else
            {
                current.next=head.next;
                return head.next;
            }
        }
        
        current=head;
        do{
            prev=current;
            current=current.next;
            if(current.data==key)
            {
                prev.next=current.next;
                break;
            }
        }while(current!=head);
       
        
    return head;
    }
}
