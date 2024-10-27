import java.util.*;

class Solution {
    public int countGroup(int[] arr) {
        int mod = (int) 1e9 + 7;
        int xr = 0;
        int n = arr.length;

        // Calculate XOR of the entire array
        for (int i = 0; i < n; i++) {
            xr ^= arr[i];
        }

        // If the XOR is not zero, return 0
        if (xr != 0) return 0;

        // Calculate the answer
        long ans = 1;
        for (int i = 0; i < n - 1; i++) {
            ans = (ans * 2) % mod;
        }

        return (int) (ans - 1);
    }
}
