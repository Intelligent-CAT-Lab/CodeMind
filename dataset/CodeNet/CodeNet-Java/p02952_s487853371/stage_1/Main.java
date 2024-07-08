
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
var newVariable_0 = st.hasMoreTokens();	            while (st == null || !newVariable_0) 
	            { 
	                try
	                { 
var newVariable_1 = br.readLine();	                    st = new StringTokenizer(newVariable_1); 
	                } 
	                catch (IOException  e) 
	                { 
	                    e.printStackTrace(); 
	                } 
	            } 
var newVariable_2 = st.nextToken();	            return newVariable_2;
	            
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
var newVariable_3 = Math.min(c1+y, c2+x);	    	return newVariable_3;
	    	
	    }
	    public static double log2(long N) 
	    { 
	  
	        // calculate log2 N indirectly 
	        // using log() method 
var newVariable_4 = Math.log(N);var newVariable_5 = Math.log(2);	        double result = (double)(Math.log(N) / newVariable_5); 
	  
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
var newVariable_6 = se.length();    		if(newVariable_6%2==1)count++;
    	}
   		System.out.println(count);
    }	
}
//2999999997

        
    

      
 