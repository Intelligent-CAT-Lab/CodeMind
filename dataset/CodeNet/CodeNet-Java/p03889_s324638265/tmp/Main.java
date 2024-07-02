import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        String s=sc.next();
        int l=s.length();
System.out.println("[INST]9;l;s.length();"+l);
        for(int i=0;i<(l+1)/2;++i){
            char c=s.charAt(i);
System.out.println("[INST]11;c;s.charAt(i);"+c);
            char d=c=='b'?'d':c=='d'?'b':c=='p'?'q':'p';
            if(d!=s.charAt(l-1-i)){
System.out.println("[INST]13;None;s.charAt(l-1-i);"+s.charAt(l-1-i));
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
            while (st == null || !st.hasMoreElements()) {
System.out.println("[INST]33;None;st.hasMoreElements();"+st.hasMoreElements());
                try {
                    st = new StringTokenizer(br.readLine());
System.out.println("[INST]35;None;br.readLine();"+br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
System.out.println("[INST]40;None;st.nextToken();"+st.nextToken());
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
System.out.println("[INST]54;str;br.readLine();"+str);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
