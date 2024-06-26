
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
	public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  String s = sc.next();
	  int n = s.length();
System.out.println("[INST]11;n;s.length();"+n);
	  // There are only two pattern s will transform to...
	  // 101010101010101010...
	  // 010101010101010101...
	  char p1 = '0';
	  char p2 = '1';
	  int pattern1 = 0;
	  int pattern2 = 0;
	  
	  for(char c: s.toCharArray()) {
System.out.println("[INST]20;None;s.toCharArray();"+s.toCharArray());
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
System.out.println("[INST]41;None;st.hasMoreElements();"+st.hasMoreElements());
        try {
          st = new StringTokenizer(br.readLine());
System.out.println("[INST]43;None;br.readLine();"+br.readLine());
        } catch (IOException  e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
System.out.println("[INST]48;None;st.nextToken();"+st.nextToken());
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
System.out.println("[INST]66;str;br.readLine();"+str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
      }
  }
}
