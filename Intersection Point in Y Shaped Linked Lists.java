class Intersect {
    // Function to find intersection point in Y-shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        // Calculate lengths of both linked lists
        int length1 = getLength(head1);
        int length2 = getLength(head2);

        // Move the pointer of the longer list by the difference in lengths
        if (length1 > length2) {
            head1 = advanceListBy(head1, length1 - length2);
        } else {
            head2 = advanceListBy(head2, length2 - length1);
        }

        // Traverse both lists and find the intersection point
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1.data;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        // If there's no intersection
        return -1;
    }

    // Helper function to get the length of a linked list
    private int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    // Helper function to advance the list by 'steps' nodes
    private Node advanceListBy(Node head, int steps) {
        while (steps > 0 && head != null) {
            head = head.next;
            steps--;
        }
        return head;
    }
}
