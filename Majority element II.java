

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        Map<Integer,Integer> voteMap=new HashMap<>();
        for(int num: nums)
        {
            voteMap.put(num,voteMap.getOrDefault(num,0)+1);
        }
        List<Integer> resList=new ArrayList<>();
        int n=nums.size();
        for(Map.Entry<Integer,Integer> entry:voteMap.entrySet())
        {
            if(entry.getValue()>n/3)
            {
                resList.add(entry.getKey()); 
            }
        }
        if(resList.isEmpty())
        {
            resList.add(-1);
        }
        return resList;
    }
}
