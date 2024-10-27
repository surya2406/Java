

// User function Template for Java

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=0 && arr[i]==arr[i+1])
            {
                arr[i]=arr[i]*2;
                arr[i+1]=0;
                
            }
        }
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                res.add(arr[i]);
                index++;
            }
        }
        while(index<arr.length)
        {
            res.add(0);
            index++;
        }
        
        return res;
    }
}
