class Solution {
    public long minEnd(int n, int x) {
        long result=x;
        long rem=n-1;
        long position=1;
        while(rem!=0)
        {
            if((x&position)==0)
            {
                result|=(rem&1)*position;
                rem>>=1;
            }
            position<<=1;
        }
        return result;
    }
}
