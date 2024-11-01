import java.util.Arrays;

class Solution {
    public long maxSum(Long[] arr) {
        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;
        Long[] arranged = new Long[n];
        int left = 0, right = n - 1;
        
        // Arrange in min-max alternating order
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arranged[i] = arr[left++];
            } else {
                arranged[i] = arr[right--];
            }
        }

        // Calculate the maximum sum of absolute differences
        long maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += Math.abs(arranged[i] - arranged[(i + 1) % n]);
        }

        return maxSum;
    }
}
