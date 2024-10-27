class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        Map<Integer,Integer> mp=new HashMap<>();
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!mp.containsKey(arr[i]))
            {
                mp.put(arr[i],i);
            }
            else
            {
                int dist=i-mp.get(arr[i]);
                max=Math.max(max,dist);
            }
        }
        return max;
    }
}
