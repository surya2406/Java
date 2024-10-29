class GfG {
    // Main QuickSort function
    public static Node quickSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Partition the list, get the new head and tail of the partitioned list
        Node[] partitioned = partition(head);
        Node leftHead = quickSort(partitioned[0]);
        Node rightHead = quickSort(partitioned[2]);

        // Connect the left part, pivot, and right part together
        return concatenate(leftHead, partitioned[1], rightHead);
    }

    // Partition the linked list around a pivot and return the heads of left and right partitions
    private static Node[] partition(Node head) {
        Node pivot = head;
        Node leftDummy = new Node(0), rightDummy = new Node(0);
        Node left = leftDummy, right = rightDummy;
        Node current = head.next;

        // Partition the list based on the pivot value
        while (current != null) {
            if (current.data < pivot.data) {
                left.next = current;
                left = left.next;
            } else {
                right.next = current;
                right = right.next;
            }
            current = current.next;
        }
        
        // Terminate the left and right lists
        left.next = null;
        right.next = null;

        // Return the heads of the left partition, pivot, and right partition
        return new Node[]{leftDummy.next, pivot, rightDummy.next};
    }

    // Concatenate the left list, pivot, and right list
    private static Node concatenate(Node left, Node pivot, Node right) {
        // Find the end of the left list
        Node newHead = left != null ? left : pivot;
        
        // Attach the pivot after the left part
        if (left != null) {
            Node temp = left;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = pivot;
        }

        // Attach the right part after the pivot
        pivot.next = right;

        return newHead;
    }
}
