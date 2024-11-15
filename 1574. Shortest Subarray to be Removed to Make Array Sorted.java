class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n=arr.length;
        int left=0;
        while(left<n-1 && arr[left]<=arr[left+1]) left++;
        int right=n-1;
        while(right>0 && arr[right]>=arr[right-1]) right--;
        int minLength=Math.min(n-left-1,right);
        int i=0,j=right;
        while(i<=left && j<n)
        {
            if(arr[i]<=arr[j])
            {
                minLength=Math.min(minLength,j-i-1);
                i++;
            }
            else
            {
                j++;
            }
        }
        return minLength;
    }
}
