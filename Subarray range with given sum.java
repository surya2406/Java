// User function Template for Java

class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0;
        int currentSum=0;
        mp.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
            currentSum+=arr[i];
            if(mp.containsKey(currentSum-tar))
            {
                count+=mp.get(currentSum-tar);
            }
            mp.put(currentSum,mp.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
}
