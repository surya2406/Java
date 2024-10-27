class Solution {
    public static int pairsum(int[] arr) {
        // code here
        Arrays.sort(arr);
        int sum=0;
        int i=arr[arr.length-1];
        int j=arr[arr.length-2];
        sum=i+j;
        return sum;
    }
}
