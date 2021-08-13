// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int p=0;
        int n=r*c;
        int top=0;
        int down=r-1;
        int left=0;
        int right=c-1;
        int round=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        while( left<=right && top<=down)
        {
           if(round==0)
           {
               int i=left;
               while(i<=right)
               {
                   
                ans.add(matrix[top][i]) ;
                i++;
                p++;
               }
               top++;
              // round=(round+1)%4;
           }
           
           if(round==1)
           {
              int i=top;
              // top++;
               while(i<=down)
               {
                   ans.add(matrix[i][right]);
                   i++;
                   p++;
               }
               right--;
               // round=(round+1)%4;
           }
           if(round==2)
           {
              int i=right;
               while(i>=left)
               {
                   ans.add(matrix[down][i]);
                   i--;
                   p++;
               }
               down--;
//round=(round+1)%4;
           }
           if(round==3)
           {
               int i=down;
               while(i>=top)
               {
                   ans.add(matrix[i][left]);
                   i--;
                   p++;
               }
               left++;
               
           }
           round=(round+1)%4;
        }
       // System.out.println(ans);
        return ans;
    }
}
