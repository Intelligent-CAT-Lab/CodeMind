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
var newVariable_0 = Math.min(a,n%(a+b));       ans=(n/(a+b))*a+newVariable_0;
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
var newVariable_1 = st.hasMoreTokens();            while (st == null || !newVariable_1) {
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
        long nextLong()
        {
            return Long.parseLong(next()); 
        }
    }

}
