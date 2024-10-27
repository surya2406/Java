

// User function Template for Java

class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        if (head == null) return null;

        // Min-heap to store nodes
        PriorityQueue<DLLNode> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);
        DLLNode current = head;
        DLLNode newHead = null;
        DLLNode lastNode = null;

        // Add first k+1 nodes to the min-heap
        for (int i = 0; i <= k && current != null; i++) {
            minHeap.add(current);
            current = current.next;
        }

        // Process the heap and construct the sorted doubly linked list
        while (!minHeap.isEmpty()) {
            DLLNode minNode = minHeap.poll();

            // If it's the first node, set as the head
            if (newHead == null) {
                newHead = minNode;
                lastNode = newHead;
            } else {
                lastNode.next = minNode; // Link the previous node to the current min
                minNode.prev = lastNode;  // Link the current min to the previous node
                lastNode = minNode;        // Move lastNode pointer forward
            }

            // Add the next node from the original list to the heap
            if (current != null) {
                minHeap.add(current);
                current = current.next;
            }
        }

        // Make sure the last node points to null
        if (lastNode != null) {
            lastNode.next = null;
        }

        return newHead; // Return the sorted doubly linked list
    }
}
