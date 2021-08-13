// { Driver Code Starts
import java.io.*;
import java.util.*;

class Difference {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    MaxDifference obj = new MaxDifference();
		    
		    System.out.println(obj.maxIndexDiff(arr, n)); // print the result
		}
	}
}// } Driver Code Ends


class MaxDifference{
    
    // Function to find maximum difference of j-1
    // arr[]: input array
    // n: size of array
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        int maxDiff=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<left[i-1])
            {
                left[i]=arr[i];
            }
            else
            {
                left[i]=left[i-1];
            }
            
        }
        for(int j=n-2;j>=0;j--)
        {
            if(arr[j]>right[j+1])
            {
                right[j]=arr[j];
            }
            else
            {
                right[j]=right[j+1];
            }
        }
      
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(left[i]);
        //     System.out.println(right[i]);
        // }
        int i=0;
        int j=0;
        while(i < n && j < n)
        {
            if(left[i] <= right[j])
            {
                maxDiff = Math.max(maxDiff, j-i);
                j++;
            }
            else
            {
                i++;
            }
        }
        return maxDiff;
        
    }
}
