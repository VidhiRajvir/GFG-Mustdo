// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  

// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        long[] ans=new long[n];
        long mul=1;
        int index=-1;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0 && count==0)
            {
                index=i;
                count++;
                continue;
            }
            else
            {
               mul=mul*arr[i]; 
            }
        }
        if(index>-1 && count==1)
        {
          for(int i=0;i<n;i++)
          {
              if(arr[i]==0)
              {
                  ans[i]=mul;
              }
              else
              {
                  ans[i]=0;
              }
          }
        }
        else if(index>-1 && count>1)
        {
          for(int i=0;i<n;i++)
          { arr[i]=0;
          }
        }
        else
        {
             for(int i=0;i<n;i++)
          {
              ans[i]=mul/arr[i];
          }
            
        }
        return ans;
        
	} 
} 
