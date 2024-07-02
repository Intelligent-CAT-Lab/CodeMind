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
      while (st == null || !st.hasMoreTokens()) {
System.out.println("[INST]44;None;st.hasMoreTokens();"+st.hasMoreTokens());
        st = new StringTokenizer(br.readLine());
System.out.println("[INST]45;None;br.readLine();"+br.readLine());
      }
      return Integer.parseInt(st.nextToken());
System.out.println("[INST]47;None;Integer.parseInt(st.nextToken());"+Integer.parseInt(st.nextToken()));
System.out.println("[INST]47;None;st.nextToken();"+st.nextToken());
    }
    
    public long nextLong() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
System.out.println("[INST]51;None;st.hasMoreTokens();"+st.hasMoreTokens());
        st = new StringTokenizer(br.readLine());
System.out.println("[INST]52;None;br.readLine();"+br.readLine());
      }
      return Long.parseLong(st.nextToken()); 
System.out.println("[INST]54;None;Long.parseLong(st.nextToken());"+Long.parseLong(st.nextToken()));
System.out.println("[INST]54;None;st.nextToken();"+st.nextToken());
    }
    
    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
System.out.println("[INST]58;None;st.hasMoreTokens();"+st.hasMoreTokens());
        st = new StringTokenizer(br.readLine());
System.out.println("[INST]59;None;br.readLine();"+br.readLine());
      }
      return st.nextToken();
System.out.println("[INST]61;None;st.nextToken();"+st.nextToken());
    }
    
    public double nextDouble() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
System.out.println("[INST]65;None;st.hasMoreTokens();"+st.hasMoreTokens());
        st = new StringTokenizer(br.readLine());
System.out.println("[INST]66;None;br.readLine();"+br.readLine());
      }
      return Double.parseDouble(st.nextToken());
System.out.println("[INST]68;None;Double.parseDouble(st.nextToken());"+Double.parseDouble(st.nextToken()));
System.out.println("[INST]68;None;st.nextToken();"+st.nextToken());
    }
    
  }
  
}