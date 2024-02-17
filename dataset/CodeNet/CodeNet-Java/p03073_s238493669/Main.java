
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
	public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  String s = sc.next();
	  int n = s.length();
	  // There are only two pattern s will transform to...
	  // 101010101010101010...
	  // 010101010101010101...
	  char p1 = '0';
	  char p2 = '1';
	  int pattern1 = 0;
	  int pattern2 = 0;
	  
	  for(char c: s.toCharArray()) {
		  if (c != p1) { pattern1++; }
		  if (c != p2) { pattern2++; }
		  
		  p1 = (p1 == '0') ? '1' : '0';
		  p2 = (p2 == '1') ? '0' : '1';
	  }
	  
	  System.out.println(Math.min(pattern1, pattern2));
	  
  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
  
    String next() { 
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException  e) {
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
        try{
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
      }
  }
}
