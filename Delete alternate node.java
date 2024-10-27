/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/

class Solution {
    public void deleteAlt(Node head) {
        // If the list is empty or has only one node, return.
        if (head == null || head.next == null) {
            return;
        }

        // Initialize current node as the head
        Node current = head;

        while (current != null && current.next != null) {
            // Store the node to be deleted (current.next)
            Node nodeToDelete = current.next;
            
            // Skip the next node
            current.next = current.next.next;
            
            // Free the memory for the node that is deleted
            nodeToDelete = null;
            
            // Move to the next alternate node (current.next)
            current = current.next;
        }
    }
}
