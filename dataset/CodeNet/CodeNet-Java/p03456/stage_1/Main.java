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
var newVariable_0 = st.hasMoreTokens();            while (!newVariable_0) {
                try {
var newVariable_1 = br.readLine();                    st = new StringTokenizer(newVariable_1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
var newVariable_2 = st.nextToken();            return newVariable_2;
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
var newVariable_3 = Math.sqrt(a);        int b= (int) newVariable_3;
        if(b*b==a) System.out.println("Yes");
        else System.out.println("No");
    }

    
}