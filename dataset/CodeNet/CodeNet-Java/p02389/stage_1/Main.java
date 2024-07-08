import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
//  ??¨?????????????????????
  static InputReader in;
  static PrintWriter out;
  
  static class Solution {
    void solve() throws IOException {
      int a = in.nextInt();
      int b = in.nextInt();
      out.println(a*b+" "+(2*a+2*b));
    }
  }

  public static void main(String[] args) throws IOException {
//    ??????
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Solution solver = new Solution();
    solver.solve();
    out.close();
}

  static class InputReader {
//    ??\???
    public BufferedReader br;
    public StringTokenizer st;
    
    public InputReader(InputStream stream) {
//      ?????????????????????
      br = new BufferedReader(new InputStreamReader(stream));
    }
   
//    ????????????????????????
    public int nextInt() throws IOException {
var newVariable_0 = st.hasMoreTokens();      while (st == null || !newVariable_0) {
var newVariable_1 = br.readLine();        st = new StringTokenizer(newVariable_1);
      }
var newVariable_2 = Integer.parseInt(st.nextToken());var newVariable_3 = st.nextToken();      return Integer.parseInt(newVariable_3);
    }
    
    public long nextLong() throws IOException {
var newVariable_4 = st.hasMoreTokens();      while (st == null || !newVariable_4) {
var newVariable_5 = br.readLine();        st = new StringTokenizer(newVariable_5);
      }
var newVariable_6 = Long.parseLong(st.nextToken());var newVariable_7 = st.nextToken();      return Long.parseLong(newVariable_7); 
    }
    
    public String next() throws IOException {
var newVariable_8 = st.hasMoreTokens();      while (st == null || !newVariable_8) {
var newVariable_9 = br.readLine();        st = new StringTokenizer(newVariable_9);
      }
var newVariable_10 = st.nextToken();      return newVariable_10;
    }
    
    public double nextDouble() throws IOException {
var newVariable_11 = st.hasMoreTokens();      while (st == null || !newVariable_11) {
var newVariable_12 = br.readLine();        st = new StringTokenizer(newVariable_12);
      }
var newVariable_13 = Double.parseDouble(st.nextToken());var newVariable_14 = st.nextToken();      return Double.parseDouble(newVariable_14);
    }
    
  }
  
}