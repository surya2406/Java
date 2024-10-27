class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        Arrays.sort(arr);
        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=arr.length-1;
        while(i<=j)
        {
            res.add(arr[j--]);
            if(i<=j)
            {
                res.add(arr[i++]);
            }
        }
        return res;
    }
}
