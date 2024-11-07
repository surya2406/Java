import java.util.ArrayList;
import java.util.List;

class Solution {
    // Function to determine if array arr can be split into three equal sum sets.
    public List<Integer> findSplit(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // If totalSum is not divisible by 3, return [-1, -1]
        if (totalSum % 3 != 0) {
            result.add(-1);
            result.add(-1);
            return result;
        }

        int target = totalSum / 3;
        int prefixSum = 0;
        int count = 0;

        // Find two indices where the cumulative sum is equal to target and 2*target
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == (count + 1) * target) {
                result.add(i);
                count++;
                if (count == 2) break;  // We only need two indices
            }
        }

        // If we found two indices, return them; otherwise, return [-1, -1]
        if (result.size() == 2) {
            return result;
        } else {
            return List.of(-1, -1);
        }
    }
}
