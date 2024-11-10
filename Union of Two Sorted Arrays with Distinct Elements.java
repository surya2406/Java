class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        Set<Integer> s=new HashSet<>();
        for(int i:a) s.add(i);
        for(int i:b) s.add(i);
        ArrayList<Integer> res=new ArrayList<>(s);
        res.sort(null);
        return res;
    }
}
