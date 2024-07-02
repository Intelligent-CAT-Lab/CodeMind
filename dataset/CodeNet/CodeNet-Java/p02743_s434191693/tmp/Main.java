import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        InputStreamScanner in = new InputStreamScanner(System.in);
        new Main().solve(in, out);
        out.flush();
System.out.println("[INST]11;None;out.flush();"+out.flush());
    }

    public BigDecimal sqrt(BigDecimal a){
        //とりあえずdoubleのsqrtを求める
        BigDecimal x = new BigDecimal(
                Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
System.out.println("[INST]17;None;a.doubleValue();"+a.doubleValue());
        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < 50; tempScale *= 2){
            x = x.subtract(
System.out.println("[INST]20;x;x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), 50, BigDecimal.ROUND_HALF_EVEN));"+x);
                    x.multiply(x).subtract(a).divide(
System.out.println("[INST]21;None;x.multiply(x).subtract(a).divide(
                    x.multiply(b2), 50, BigDecimal.ROUND_HALF_EVEN);"+x.multiply(x).subtract(a).divide(
                    x.multiply(b2), 50, BigDecimal.ROUND_HALF_EVEN));
System.out.println("[INST]21;None;x.multiply(x).subtract(a);"+x.multiply(x).subtract(a));
System.out.println("[INST]21;None;x.multiply(x);"+x.multiply(x));
                    x.multiply(b2), 50, BigDecimal.ROUND_HALF_EVEN));
System.out.println("[INST]22;None;x.multiply(b2);"+x.multiply(b2));
        }
        return x;
    }

    private void solve(InputStreamScanner in, PrintWriter out) {
        //int a = in.nextInt();
        //int b = in.nextInt();
        //int c = in.nextInt();
        BigDecimal a = sqrt(new BigDecimal(in.next()));
        BigDecimal b = sqrt(new BigDecimal(in.next()));
        BigDecimal c = sqrt(new BigDecimal(in.next()));

      	if ((a.add(b)).compareTo(c) < 0) {
System.out.println("[INST]35;None;(a.add(b)).compareTo(c);"+(a.add(b)).compareTo(c));
System.out.println("[INST]35;None;a.add(b);"+a.add(b));
            out.println("Yes");
        } else {
            out.println("No");
        }
    }

    static class InputStreamScanner {

        private InputStream in;

        private byte[] buf = new byte[1024];
        private int len = 0;
        private int off = 0;

        InputStreamScanner(InputStream in)	{
            this.in = in;
        }

        String next() {
            StringBuilder sb = new StringBuilder();
            for (int b = skip(); !isSpace(b);){
                sb.appendCodePoint(b);
System.out.println("[INST]57;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
                b = read();
            }
            return sb.toString();
System.out.println("[INST]60;None;sb.toString();"+sb.toString());
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

        char nextChar() {
            return (char)skip();
        }

        int skip() {
            for (int b; (b = read()) != -1;) {
                if (!isSpace(b)) {
                    return b;
                }
            }
            return -1;
        }

        private boolean isSpace(int c) {
            return c < 33 || c > 126;
        }

        private int read() {
            if (len == -1) {
                throw new InputMismatchException("End of Input");
            }
            if (off >= len){
                off = 0;
                try {
                    len = in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException(e.getMessage());
System.out.println("[INST]101;None;e.getMessage();"+e.getMessage());
                }
                if (len <= 0) {
                    return -1;
                }
            }
            return buf[off++];
        }
    }
}