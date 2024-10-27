// User function Template for Java

class Solution {
    static int sameOccurrence(int arr[], int x, int y) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1); // To handle the case when the prefix sum is 0
        int balance = 0;
        int result = 0;
        
        for (int num : arr) {
            // Increment balance for x and decrement for y
            if (num == x) {
                balance++;
            } else if (num == y) {
                balance--;
            }
            
            // Check if this balance has been seen before
            result += countMap.getOrDefault(balance, 0);
            
            // Update the count of the current balance
            countMap.put(balance, countMap.getOrDefault(balance, 0) + 1);
        }
        
        return result;
    }
}
