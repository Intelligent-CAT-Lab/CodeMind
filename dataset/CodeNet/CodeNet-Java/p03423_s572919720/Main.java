import java.math.*;
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args ) throws IOException{
    	FastReader fr = new FastReader();
    	int n = fr.nextInt();
    	if(n < 3){
    		System.out.println(0);
    	}
    	else{
    		int result = n/3;
    		System.out.println(result);
    	}
    }
}


class FastReader {
	  BufferedReader br;
	  StringTokenizer st;

	  FastReader() {
	    br = new BufferedReader(new InputStreamReader(System.in));
	  }

	  String next() {
	    while (st == null || !st.hasMoreTokens()) {
	      try {
	        st = new StringTokenizer(br.readLine());
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    }
	    return st.nextToken();
	  }

	  int nextInt() {
	    return Integer.parseInt(next());
	  }

	  long nextLong() {
	    return Long.parseLong(next());
	  }

	  double nextDouble() {
	    return Double.parseDouble(next());
	  }

	  String nextLine() {
	    String str = "";
	    try {
	      str = br.readLine();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    return str;
	  }
	}

	//source: http://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
