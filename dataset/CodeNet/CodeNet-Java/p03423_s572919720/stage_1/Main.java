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
var newVariable_0 = st.hasMoreTokens();	    while (st == null || !newVariable_0) {
	      try {
var newVariable_1 = br.readLine();	        st = new StringTokenizer(newVariable_1);
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    }
var newVariable_2 = st.nextToken();	    return newVariable_2;
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
