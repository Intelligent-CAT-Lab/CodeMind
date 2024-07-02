import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) {
        FastScanner sc=new FastScanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();
        long ans=0;
       ans=(n/(a+b))*a+Math.min(a,n%(a+b));
System.out.println("[INST]10;None;Math.min(a,n%(a+b));"+Math.min(a,n%(a+b)));
       System.out.println(ans);
       
        
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
System.out.println("[INST]30;None;st.hasMoreTokens();"+st.hasMoreTokens());
                try {
                    st = new StringTokenizer(br.readLine());
System.out.println("[INST]32;None;br.readLine();"+br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
System.out.println("[INST]37;None;st.nextToken();"+st.nextToken());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong()
        {
            return Long.parseLong(next()); 
        }
    }

}
