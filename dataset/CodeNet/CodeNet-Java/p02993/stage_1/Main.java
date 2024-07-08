
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
var newVariable_0 = word.length();        for(int i=0;i<newVariable_0-1;i++){
var newVariable_1 = word.charAt(i);var newVariable_2 = word.charAt(i+1);            if(word.charAt(i)==newVariable_2){
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
var newVariable_3 = st.hasMoreTokens();        while (st == null || !newVariable_3)
var newVariable_4 = br.readLine();            st = new StringTokenizer(newVariable_4);
var newVariable_5 = st.nextToken();        return newVariable_5;
    }

    public int nextInt() throws IOException {return Integer.parseInt(next());}

    public long nextLong() throws IOException {return Long.parseLong(next());}

var newVariable_6 = br.readLine();    public String nextLine() throws IOException {return newVariable_6;}

    public double nextDouble() throws IOException
    {
        String x = next();
        StringBuilder sb = new StringBuilder("0");
        double res = 0, f = 1;
        boolean dec = false, neg = false;
        int start = 0;
var newVariable_7 = x.charAt(0);        if(newVariable_7 == '-')
        {
            neg = true;
            start++;
        }
var newVariable_8 = x.length();        for(int i = start; i < newVariable_8; i++)
var newVariable_9 = x.charAt(i);            if(newVariable_9 == '.')
            {
var newVariable_10 = sb.toString();                res = Long.parseLong(newVariable_10);
                sb = new StringBuilder("0");
                dec = true;
            }
            else
            {
var newVariable_11 = sb.append(x.charAt(i));var newVariable_12 = x.charAt(i);                sb.append(newVariable_12);
                if(dec)
                    f *= 10;
            }
var newVariable_13 = Long.parseLong(sb.toString());var newVariable_14 = sb.toString();        res += Long.parseLong(newVariable_14) / f;
        return res * (neg?-1:1);
    }

    public boolean ready() throws IOException {return br.ready();}


}