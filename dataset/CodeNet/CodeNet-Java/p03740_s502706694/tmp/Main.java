import java.io.*;
import java.math.BigInteger;

public class Main  implements Runnable {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
System.out.println("[INST]7;None;new Thread(null, new Main(), '', 16 * 1024 * 1024).start();"+new Thread(null, new Main(), "", 16 * 1024 * 1024).start());
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
        long tx = x - Math.min(x, y);
System.out.println("[INST]26;None;Math.min(x, y);"+Math.min(x, y));
        long ty = y - Math.min(x, y);
System.out.println("[INST]27;None;Math.min(x, y);"+Math.min(x, y));
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
        while((c=in.read())!=-1&&Character.isWhitespace(c));
System.out.println("[INST]45;c;in.read();"+c);
System.out.println("[INST]45;None;Character.isWhitespace(c);"+Character.isWhitespace(c));
        while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
System.out.println("[INST]46;None;Character.isWhitespace(c);"+Character.isWhitespace(c));
System.out.println("[INST]46;None;sb.append((char)c);"+sb.append((char)c));
System.out.println("[INST]46;c;in.read();"+c);
        return sb.toString();
System.out.println("[INST]47;None;sb.toString();"+sb.toString());
    }
    public String readLine()throws IOException{
        StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
System.out.println("[INST]50;c;in.read();"+c);
        while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
System.out.println("[INST]51;None;sb.append((char)c);"+sb.append((char)c));
System.out.println("[INST]51;c;in.read();"+c);
        return sb.toString();
System.out.println("[INST]52;None;sb.toString();"+sb.toString());
    }
    public long nextLong()throws IOException,NumberFormatException
    {return Long.parseLong(nextToken());}
    public int nextInt()throws NumberFormatException,IOException
    {return(int)nextLong();}
    public double nextDouble()throws NumberFormatException,IOException
    {return Double.parseDouble(nextToken());}
    public void close() throws IOException {in.close();}
}