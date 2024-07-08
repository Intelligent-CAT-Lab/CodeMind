import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        String s=sc.next();
        int l=s.length();
        for(int i=0;i<(l+1)/2;++i){
            char c=s.charAt(i);
            char d=c=='b'?'d':c=='d'?'b':c=='p'?'q':'p';
var newVariable_0 = s.charAt(l-1-i);            if(d!=newVariable_0){
                out.println("No");
                out.close();
                return;
            }
        }
        out.println("Yes");
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
var newVariable_1 = st.hasMoreElements();            while (st == null || !newVariable_1) {
                try {
var newVariable_2 = br.readLine();                    st = new StringTokenizer(newVariable_2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
var newVariable_3 = st.nextToken();            return newVariable_3;
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
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
