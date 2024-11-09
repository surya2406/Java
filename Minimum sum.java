class Solution {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        boolean flag=true;
        for(int i:arr)
        {
            if(flag) sb1.append(i);
            else 
            {
                sb2.append(i);
            }
            flag=!flag;
        }
        int i=sb1.length()-1,j=sb2.length()-1,carry=0;
        while(i>=0||j>=0||carry==1)
        {
            int val1=i>=0?sb1.charAt(i)-'0':0;
            int val2=j>=0?sb2.charAt(j)-'0':0;
            int sum=val1+val2+carry;
            carry=sum/10;
            ans.append(sum%10);
            i--;
            j--;
        }
        String res=ans.reverse().toString();
        int x=0;
        while(x<=res.length()&&res.charAt(x)=='0')
        {
            x++;
        }
        return res.substring(x);
    }
}
