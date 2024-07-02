import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
System.out.println("[INST]17;str;br.readLine();"+str);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
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

        String next() {
            while (st == null || !st.hasMoreElements()) {
System.out.println("[INST]37;None;st.hasMoreElements();"+st.hasMoreElements());
                try {
                    st = new StringTokenizer(br.readLine());
System.out.println("[INST]39;None;br.readLine();"+br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
System.out.println("[INST]44;None;st.nextToken();"+st.nextToken());
        }


    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        Main obj = new Main();
        long sum=0;
        long h=s.nextLong();
        if(h==1)
            System.out.println(1);

        else
        {
            long count=1;
            while(h>1)
            {
                h=h/2;
                sum+= (long) Math.pow(2,count);
System.out.println("[INST]64;None;Math.pow(2,count);"+Math.pow(2,count));
                count++;
            }
            System.out.println(sum+1);
        }
    }






}