import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        String s = sc.next();
        int price = 700;
        for (int i = 0; i < s.length(); i++) {
System.out.println("[INST]10;None;s.length();"+s.length());
            char c = s.charAt(i);
System.out.println("[INST]11;c;s.charAt(i);"+c);
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
            while (st == null || !st.hasMoreElements())
System.out.println("[INST]27;None;st.hasMoreElements();"+st.hasMoreElements());
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
System.out.println("[INST]31;None;br.readLine();"+br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
System.out.println("[INST]38;None;st.nextToken();"+st.nextToken());
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
System.out.println("[INST]60;str;br.readLine();"+str);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}