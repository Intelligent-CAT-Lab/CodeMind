import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        String s = sc.next();
        int price = 700;
var newVariable_0 = s.length();        for (int i = 0; i < newVariable_0; i++) {
            char c = s.charAt(i);
            if (c == 'o') price += 100;
        }
        System.out.println(price);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
var newVariable_1 = st.hasMoreElements();            while (st == null || !newVariable_1)
            {
                try
                {
var newVariable_2 = br.readLine();                    st = new StringTokenizer(newVariable_2);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
var newVariable_3 = st.nextToken();            return newVariable_3;
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}