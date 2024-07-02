import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 

public class Main
{
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
System.out.println("[INST]13;None;st.hasMoreTokens();"+st.hasMoreTokens());
                try {
                    st = new StringTokenizer(br.readLine());
System.out.println("[INST]15;None;br.readLine();"+br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
System.out.println("[INST]20;None;st.nextToken();"+st.nextToken());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }

        public String nextline() {
            return null;
        }
    }
 
    public static void main(String[] args) 
    {
        FastScanner sc=new FastScanner();
        String s=sc.next(),t=sc.next();
        String mah=s+t;
        int a=Integer.parseInt(mah);
System.out.println("[INST]44;a;Integer.parseInt(mah);"+a);
        int b= (int) Math.sqrt(a);
System.out.println("[INST]45;None;Math.sqrt(a);"+Math.sqrt(a));
        if(b*b==a) System.out.println("Yes");
        else System.out.println("No");
    }

    
}