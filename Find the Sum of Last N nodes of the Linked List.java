class Solution {
    public int sumOfLastN_Nodes(Node head, int n) {
        // Check for edge cases
        if (head == null || n <= 0) return 0;

        Node fast = head;
        Node slow = head;

        // Move the 'fast' pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) return 0; // In case n is greater than the length of the list
            fast = fast.next;
        }

        // Move both pointers until 'fast' reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Calculate the sum of the last n nodes
        int sum = 0;
        while (slow != null) {
            sum += slow.data;
            slow = slow.next;
        }

        return sum;
    }
}
