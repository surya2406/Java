// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
         int result = 0;  // Initialize result
        
        // XOR all elements in the array
        for (int num : arr) {
            result ^= num;  // XOR current number with result
        }
        
        return result;  
    }
}
