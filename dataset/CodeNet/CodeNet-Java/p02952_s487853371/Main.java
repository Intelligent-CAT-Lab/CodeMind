
import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


/**
 * @author Utkarsh
 *
 */
public  class Main 
{

	   
	   static class FastReader 
	    { 
	        BufferedReader br; 
	        StringTokenizer st; 
	       
	  
	        public FastReader() 
	        { 
	            br = new BufferedReader(new
	                     InputStreamReader(System.in)); 
	        } 
	  
	        String next() 
	        { 
	            while (st == null || !st.hasMoreTokens()) 
	            { 
	                try
	                { 
	                    st = new StringTokenizer(br.readLine()); 
	                } 
	                catch (IOException  e) 
	                { 
	                    e.printStackTrace(); 
	                } 
	            } 
	            return st.nextToken();
	            
	        } 
	  
	        int nextInt() 
	        { 
	            return Integer.parseInt(next()); 
	        } 
	  
	        long nextLong() 
	        { 
	            return Long.parseLong(next()); 
	        } 
	  
	        double nextDouble() 
	        { 
	            return Double.parseDouble(next()); 
	        } 
	  
	        String nextLine() 
	        { 
	            String str = ""; 
	            try
	            { 
	                str = br.readLine(); 
	            } 
	            catch (IOException e) 
	            { 
	                e.printStackTrace(); 
	            } 
	            return str; 
	        }

			public Character charAt(int i) {
				// TODO Auto-generated method stub
				return null;
			}

			public BigInteger nextBigInteger() {
				// TODO Auto-generated method stub
				return null;
			} 
	    } 

  

	  // Complete the hurdleRace function below.
//    public static void solve() {
//    	FastReader s=new FastReader();
	    int binarySearch(int arr[], int l, int r, int x) 
	    { 
	        if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	  
	            // If the element is present at the 
	            // middle itself 
	            if (arr[mid] == x) 
	                return mid; 
	  
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray 
	            if (arr[mid] > x) 
	                return binarySearch(arr, l, mid - 1, x); 
	  
	            // Else the element can only be present 
	            // in right subarray 
	            return binarySearch(arr, mid + 1, r, x); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
	        return -1; 
	    } 
	  
	    static // Driver method to test above 

	// Java implementation of iterative Binary Search 

	    // Returns index of x if it is present in arr[], 
	    // else return -1 
	    int lowerBound(int[] a,int n,int key){
	        int s =0,e=n-1;
	        int ans = -1;

	        while(s<=e){
	            int mid = (s+e)/2;

	            if(a[mid]==key){
	                ans = mid;
	                e = mid - 1;
	            }
	            else if(a[mid]>key){
	                e = mid - 1;
	            }
	            else{
	                s = mid + 1;
	            }
	        }

	        return ans;
	    }
	    static int count(String se,char c,int l,int r) {
			if(l==r) {
				if(se.charAt(l)==c)return 0;
				else return 1;
			}
			int mid = (l+r)/2;
			int c1=0,c2=0;
			for(int i=l;i<=mid;i++) {
				if(se.charAt(i)!=c)c1++;
			}
			for(int i=r;i>mid;i--) {
				if(se.charAt(i)!=c)c2++;
			}
			int y = count(se,(char)((int)c+1),mid+1,r);
			int x = count(se,(char)((int)c+1),l,mid);
	    	return Math.min(c1+y, c2+x);
	    	
	    }
	    public static double log2(long N) 
	    { 
	  
	        // calculate log2 N indirectly 
	        // using log() method 
	        double result = (double)(Math.log(N) / Math.log(2)); 
	  
	        return result; 
	    }
	    static boolean sign(long n) {
	    	return n>0;
	    }
	    public static int solve(long[] ar,int n) {
	    	long sum=0;
	    	for(int i=0;i<n;i++) {
	    		sum+=ar[i];
	    		if(sum<=0)return 0;
			}
	    	sum=0;
	    	for(int i=n-1;i>=0;i--) {
	    		sum+=ar[i];
	    		if(sum<=0)return 0;
	    	}
			return 1;
	    }
    public static void main(String[] args) throws IOException {
    	FastReader s=new FastReader();
    	int n = s.nextInt();
    	int  count=0;
    	for(int i=1;i<=n;i++) {
    		String se = String.valueOf(i);
    		if(se.length()%2==1)count++;
    	}
   		System.out.println(count);
    }	
}
//2999999997

        
    

      
 