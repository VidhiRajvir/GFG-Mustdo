// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int target = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.threeSumClosest(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int threeSumClosest(int[] array, int target)  
	{ 
        // code here
        Arrays.sort(array);
        int min_diff=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<array.length;i++)
        {
            int j=i+1;
            int k=array.length-1;
            while(j<k)
            {
                int sum=array[i]+array[j]+array[k];
                if(sum==target)
                {
                    return sum;
                }
                else if(sum>target)
                {
                    
                    int diff=Math.abs(sum-target);
                    
                    if(diff<=min_diff)
                    {
                        if(diff==min_diff)
                        {
                            if(sum>ans)
                            {
                                 min_diff=diff;
                                ans=sum;
                            }
                        }
                        else
                        {
                             min_diff=diff;
                             ans=sum;
                        }
                       
                    }
                    k--;
                }
                else{
                
                    int diff=Math.abs(sum-target);
                    
                    if(diff<=min_diff)
                    {
                        if(diff==min_diff)
                        {
                            if(sum>ans)
                            {
                                 min_diff=diff;
                                ans=sum;
                            }
                        }
                        else
                        {
                             min_diff=diff;
                             ans=sum;
                        }
                       
                    }
                    j++;
                }
            }
        }
        return ans;
        
	} 
} 
