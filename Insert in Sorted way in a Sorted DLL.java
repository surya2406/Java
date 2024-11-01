class Solution {
    public Node sortedInsert(Node head, int x) {
        // Create a new node with data x
        Node newNode = new Node(x);

        // Case 1: Empty list
        if (head == null) {
            return newNode;
        }

        // Case 2: Insert at the beginning
        if (x <= head.data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        // Case 3: Traverse the list to find insertion position
        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }

        // Insert newNode after current
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;

        return head;
    }
}
