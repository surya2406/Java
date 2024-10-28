class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        // ArrayList<Integer> res=new ArrayList<>();
        // int k=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     boolean isDuplicate=false;
        //     for(int j=0;j<k;j++)
        //     {
        //         if(arr[i]==res.get(j))
        //         {
        //             isDuplicate=true;
        //             break;
        //         }
        //     }
        //     if(!isDuplicate) 
        //     {
        //         res.add(arr[i]);
        //         k++;
        //     }
        // }
        // return res;
        Set<Integer> st=new LinkedHashSet<>();
        for(int num:arr)
        {
            st.add(num);
        }
        ArrayList<Integer> res=new ArrayList<>(st);
        return res;
        
    }
}
