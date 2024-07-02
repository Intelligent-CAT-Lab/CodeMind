
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        boolean flag = false;
        for(int i=0;i<word.length()-1;i++){
System.out.println("[INST]15;None;word.length();"+word.length());
            if(word.charAt(i)==word.charAt(i+1)){
System.out.println("[INST]16;None;word.charAt(i);"+word.charAt(i));
System.out.println("[INST]16;None;word.charAt(i+1);"+word.charAt(i+1));
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("Bad");
        else System.out.println("Good");
    }




}


class Scanner
{
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

    public String next() throws IOException
    {
        while (st == null || !st.hasMoreTokens())
System.out.println("[INST]40;None;st.hasMoreTokens();"+st.hasMoreTokens());
            st = new StringTokenizer(br.readLine());
System.out.println("[INST]41;None;br.readLine();"+br.readLine());
        return st.nextToken();
System.out.println("[INST]42;None;st.nextToken();"+st.nextToken());
    }

    public int nextInt() throws IOException {return Integer.parseInt(next());}

    public long nextLong() throws IOException {return Long.parseLong(next());}

    public String nextLine() throws IOException {return br.readLine();}
System.out.println("[INST]49;None;br.readLine();"+br.readLine());

    public double nextDouble() throws IOException
    {
        String x = next();
        StringBuilder sb = new StringBuilder("0");
        double res = 0, f = 1;
        boolean dec = false, neg = false;
        int start = 0;
        if(x.charAt(0) == '-')
System.out.println("[INST]58;None;x.charAt(0);"+x.charAt(0));
        {
            neg = true;
            start++;
        }
        for(int i = start; i < x.length(); i++)
System.out.println("[INST]63;None;x.length();"+x.length());
            if(x.charAt(i) == '.')
System.out.println("[INST]64;None;x.charAt(i);"+x.charAt(i));
            {
                res = Long.parseLong(sb.toString());
System.out.println("[INST]66;res;Long.parseLong(sb.toString());"+res);
System.out.println("[INST]66;None;sb.toString();"+sb.toString());
                sb = new StringBuilder("0");
                dec = true;
            }
            else
            {
                sb.append(x.charAt(i));
System.out.println("[INST]72;None;sb.append(x.charAt(i));"+sb.append(x.charAt(i)));
System.out.println("[INST]72;None;x.charAt(i);"+x.charAt(i));
                if(dec)
                    f *= 10;
            }
        res += Long.parseLong(sb.toString()) / f;
System.out.println("[INST]76;None;Long.parseLong(sb.toString());"+Long.parseLong(sb.toString()));
System.out.println("[INST]76;None;sb.toString();"+sb.toString());
        return res * (neg?-1:1);
    }

    public boolean ready() throws IOException {return br.ready();}


}