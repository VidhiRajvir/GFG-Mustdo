// { Driver Code Starts
import java.io.*;
import java.util.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Kadane obj = new Kadane();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Kadane{
    
    // Function to find circular subarray with maximum sum
    // a: input array
    // n: size of array
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        if (n==1)
        {
            return a[0];
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        int min=0;
        int max=0;
        int min1=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            min=Math.min(min+a[i],a[i]);
            //System.out.println("min"+min);
            if(min<min1)
            {
                
                min1=min;
                //System.out.println("min1"+min1);
            }
        }
        for(int i=0;i<n;i++)
        {
            max=Math.max(max+a[i],a[i]);
          //System.out.println("max"+max);
            if(max>max1)
            {
                
                max1=max;
               // System.out.println("max1"+max1);
            }
        }
        // System.out.println(sum);
        // System.out.println(max1);
        // System.out.println(min1);
        
        return Math.max(max1,(sum-min1));
    }
    
}
