// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class Driverclass
{
    // Driver Code
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    
		    // Making object of GfG	
			Subseq g = new Subseq();
			
			System.out.println(g.findLongestConseqSubseq(a, n));
		
		t--;
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Subseq
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    // return the length of the longest subsequene of consecutive integers
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	    int count = 0;
	    //int i=0;
	    int maxlen=0;
	    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	    for(int j=0;j<arr.length;j++)
	    {
	        map.put(arr[j],1);
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	        if(map.containsKey(arr[i]-1))
	        {
	            map.put(arr[i],0);
	        }
	    }
	    for(int i=0;i<arr.length;i++){
	        int c=map.get(arr[i]);
	        count=0;
	        if(c==1)
	        {
	            int k=arr[i];
	            while(map.containsKey(k))
	            {
	                
	                k++;
	                count++;
	            }
	        }
	       
	        maxlen=Math.max(count,maxlen);
	    }
	    return maxlen;
	}
}
