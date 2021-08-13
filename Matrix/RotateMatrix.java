// { Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class DriverClass
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            
            GFG g = new GFG();
            g.rotate(arr);
            printMatrix (arr);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
        int N=matrix.length;
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(i!=j)
                {
                   int temp= matrix[i][j];
                   matrix[i][j]=matrix[j][i];
                   matrix[j][i]=temp;
                }
            }
        }
        // for(int i=0;i<N;i++)
        // {
        //     for(int j=0;j<N;j++)
        //     {
        //         System.out.print(matrix[i][j]+"\t");
        //     }
        //     System.out.print("\n");
        //     }
        // int i=0;
        // int j=N-1;
        // while(i<=j)
        // {
        //     for(int k=0;k<N;k++)
        //     {
        //         int temp=matrix[i][k];
        //         matrix[i][k]=matrix[j][k];
        //         matrix[j][k]=temp;
        //         k++;
        //     }
        //     j--;
        //     i++;
        // }
         int low=0;
        int high=N-1;
        while(low<=high)
        {
            for(int j=0;j<N;j++)
            {
                int temp=matrix[low][j];
                matrix[low][j]=matrix[high][j];
                matrix[high][j]=temp;
            }
            low++;
            high--;
        }
    }
}
