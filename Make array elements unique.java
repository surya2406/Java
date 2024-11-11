class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Arrays.sort(arr);
        int increment=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<=arr[i-1])
            {
                int needIncrement=arr[i-1]-arr[i]+1;
                arr[i]+=needIncrement;
                increment+=needIncrement;
            }
        }
        return increment;
    }
}
