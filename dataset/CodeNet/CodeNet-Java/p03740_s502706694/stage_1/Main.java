import java.io.*;
import java.math.BigInteger;

public class Main  implements Runnable {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        Main main = new Main();
        try {
            in = new ContestScanner();
            out = new Writer();
            main.solve();
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void solve() throws IOException {
        long x = in.nextLong();
        long y = in.nextLong();
var newVariable_0 = Math.min(x, y);        long tx = x - newVariable_0;
var newVariable_1 = Math.min(x, y);        long ty = y - newVariable_1;
        System.out.println((tx + ty <= 1) ? "Brown" : "Alice");
    }
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException {super(System.out);}
}
class ContestScanner implements Closeable {
    private BufferedReader in;private int c=-2;
    public ContestScanner()throws IOException
    {in=new BufferedReader(new InputStreamReader(System.in));}
    public ContestScanner(String filename)throws IOException
    {in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
    public String nextToken()throws IOException {
        StringBuilder sb=new StringBuilder();
var newVariable_2 = Character.isWhitespace(c);        while((c=in.read())!=-1&&newVariable_2);
var newVariable_3 = Character.isWhitespace(c);var newVariable_4 = sb.append((char)c);        while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
var newVariable_5 = sb.toString();        return newVariable_5;
    }
    public String readLine()throws IOException{
        StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
var newVariable_6 = sb.append((char)c);        while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
var newVariable_7 = sb.toString();        return newVariable_7;
    }
    public long nextLong()throws IOException,NumberFormatException
    {return Long.parseLong(nextToken());}
    public int nextInt()throws NumberFormatException,IOException
    {return(int)nextLong();}
    public double nextDouble()throws NumberFormatException,IOException
    {return Double.parseDouble(nextToken());}
    public void close() throws IOException {in.close();}
}