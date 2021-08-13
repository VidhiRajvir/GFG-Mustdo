// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int n = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i=0; i<n; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            
            //calling frequncycount() function
            Frequency obj = new Frequency();
            obj.frequencycount(arr, n); 
            
            //printing array elements
            for(int i=0; i<n; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}



// } Driver Code Ends


class Frequency{
    public static void frequencycount(int arr[], int n)
    {
        // code here
       /* HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int j=0;j<arr.length;j++)
        {
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
        }
        int i=1;
        while(i<n+1)
        {
            if(map.containsKey(i))
            {
                arr[i-1]=map.get(i);
            }
            else
            {
                arr[i-1]=0;
            }
            i++;
        }*/
        for (int j = 0; j < n; j++)
            arr[j] = arr[j] - 1;

        // Use every element arr[i] as index and add 'n' to
        // element present at arr[i]%n to keep track of count of
        // occurrences of arr[i]
        for (int i = 0; i < n; i++)
            arr[arr[i] % n] = arr[arr[i] % n] + n;

        // To print counts, simply print the number of times n
        // was added at index corresponding to every element
      for (int i = 0; i < n; i++)
          arr[i] = arr[i] / n;
    }
}
