class Solution {
    public int pairWithMaxSum(int[] arr) {
        // If there are less than two elements, return -1
        if (arr.length < 2) {
            return -1;
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        // Iterate through the array and calculate sum of consecutive pairs
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            // Update the maximum sum
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}
