import java.util.Arrays;    
class Solution {
    public boolean search(int[] arr, int sum, int lo, int hi) {
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == sum) return true;
            else if (arr[mid] < sum) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }
  
    public boolean findTriplet(int[] arr) {
        int n = arr.length;
        // Sort the array
        Arrays.sort(arr);
        
        // Loop through the array to find the triplet
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                // Search for the third element in the sorted array
                if (search(arr, sum, j + 1, n - 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
