import java.util.Arrays;

class Solution {
    public int[] rearrange(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.fill(result, -1); // Fill the result array with -1

        // Iterate over the input array
        for (int i = 0; i < arr.length; i++) {
            // If the element is within the valid index range, place it in its correct position
            if (arr[i] >= 0 && arr[i] < arr.length) {
                result[arr[i]] = arr[i];
            }
        }

        return result;
    }
}
