// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i=0;
        int j=0;
        int count=0;
        long [] ans=new long[n+m];
        // while(i<n && j<n)
        // {
        //     if(arr1[i]<arr2[j] && )
        //     {
        //         ans[count]=(long)arr1[i];
        //         i++;
                
        //         count++;
        //     }
        //     else if(arr1[i]>arr2[j])
        //     {
        //         ans[count]=(long)arr2[j];
        //         j++;
        //         count++;
        //     }
        // }
        // if(i==n && j<m && count<n+m)
        // {
        //   while(j<m)
        //   {
        //       ans[count]=arr2[j];
        //       j++;
        //   }
        // }
        // else if(j==m && i<n && count<n+m)
        // {
        //   while(i<n)
        //   {
        //       ans[count]=arr1[i];
        //       i++;
        //   }
        // }
        // return ans[k-1];
        while(i<n || j<m)
        {
            if(k==1)
            {
                if(i<n && j<m)
                {
                    return Math.min(arr1[i],arr2[j]);
                }
                else if(i==n && j<m)
                {
                    return arr2[j];
                }
                else if(j==m && i<n)
                {
                    return arr1[i];
                }
            }
            if(i<n && j<m && arr1[i]<arr2[j])
            {
                i++;
               // k--;
            }
            else if(i<n && j<m && arr2[j]<arr1[i])
            {
                j++;
            }
            else if(i==n)
            {
                j++;
            }
            else
            {
                i++;
            }
            k--;
        }
        return 0;
        
    }
}
