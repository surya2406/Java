/*Function should return the head of the 2D LL.*/
class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        return constructUtil(arr,0,0);
        
    }
    static Node constructUtil(int[][] arr,int i,int j)
    {
        if(i>=arr.length||j>=arr[0].length) return null;
        Node curr=new Node(arr[i][j]);
        curr.right=constructUtil(arr,i,j+1);
        curr.down=constructUtil(arr,i+1,j);
        return curr;
    }
    static void printList(Node head)
    {
        Node currRow=head;
        while(currRow!=null)
        {
            Node currCol=currRow;
            while(currCol!=null)
            {
                System.out.print(currCol.data+" ");
                currCol=currCol.right;
            }
            System.out.println();
            currRow=currRow.down;
        }
    }  
}
