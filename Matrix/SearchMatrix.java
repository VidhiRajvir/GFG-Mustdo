// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}
         	int target = sc.nextInt();
         	
			Solution x = new Solution();
			
			if (x.search(matrix, rows, columns, target)) 
				System.out.println(1); 
			else
				System.out.println(0); 
			t--;
		}
	} 
}// } Driver Code Ends


class Solution 
{ 
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	   // for(int i=0;i<n;i++)
	   // {
	   //     if((matrix[i][0]<=x) && (matrix[i][m-1]>=x))
	   //     {
	   //         for(int j=0;j<m;j++)
	   //         {
	   //             if(matrix[i][j]==x)
	   //             {
	   //                 return true;
	   //             }
	   //         }
	   //     }
	   // }
	   // return false;
	   int i=0;
	   int j=m-1;
	   while(j>=0 && i<=n-1)
	   {
	       int c=matrix[i][j];
	       if(c>x)
	       {
	           j--;
	       }
	       if(c<x)
	       {
	          i++; 
	       }
	       if(c==x)
	       {
	           return true;
	       }
	   }
	   return false;
	    
	} 
} 
