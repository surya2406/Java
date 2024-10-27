

// User function Template for Java
/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/

class Solution {
    
    Node[] alternatingSplitList(Node head) {
        // Check if the list is empty
        if (head == null) {
            return new Node[]{null, null};
        }
        
        // Pointers to create the two new lists
        Node list1 = null, list2 = null;
        Node list1Tail = null, list2Tail = null;
        
        // To track which list we are adding to: true means list1, false means list2
        boolean addToList1 = true;
        
        // Traverse the original list
        Node curr = head;
        while (curr != null) {
            if (addToList1) {
                // Add to list1
                if (list1 == null) {
                    list1 = curr;
                    list1Tail = list1;
                } else {
                    list1Tail.next = curr;
                    list1Tail = list1Tail.next;
                }
            } else {
                // Add to list2
                if (list2 == null) {
                    list2 = curr;
                    list2Tail = list2;
                } else {
                    list2Tail.next = curr;
                    list2Tail = list2Tail.next;
                }
            }
            // Switch between lists
            addToList1 = !addToList1;
            curr = curr.next;
        }
        
        // End the two lists properly
        if (list1Tail != null) {
            list1Tail.next = null;
        }
        if (list2Tail != null) {
            list2Tail.next = null;
        }
        
        // Return the two lists as an array
        return new Node[]{list1, list2};
    }
    
    // Helper function to print the linked list
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
