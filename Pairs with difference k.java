class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int count=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:arr) mp.put(num,mp.getOrDefault(num,0)+1);
        for(int num:arr) count+=mp.getOrDefault(num+k,0);
        return count;
    }
}
