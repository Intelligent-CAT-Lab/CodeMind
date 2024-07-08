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
    }

    public BigDecimal sqrt(BigDecimal a){
        //とりあえずdoubleのsqrtを求める
        BigDecimal x = new BigDecimal(
var newVariable_0 = a.doubleValue();                Math.sqrt(newVariable_0), MathContext.DECIMAL64);
        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < 50; tempScale *= 2){
            x = x.subtract(
var newVariable_1 = x.multiply(x).subtract(a).divide(
                    x.multiply(b2), 50, BigDecimal.ROUND_HALF_EVEN);var newVariable_2 = x.multiply(x).subtract(a);var newVariable_3 = x.multiply(x);                    newVariable_3.subtract(a).divide(
var newVariable_4 = x.multiply(b2);                    newVariable_4, 50, BigDecimal.ROUND_HALF_EVEN));
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

var newVariable_5 = (a.add(b)).compareTo(c);var newVariable_6 = a.add(b);      	if ((newVariable_6).compareTo(c) < 0) {
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
var newVariable_7 = sb.appendCodePoint(b);                b = read();
            }
var newVariable_8 = sb.toString();            return newVariable_8;
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
var newVariable_9 = e.getMessage();                    throw new InputMismatchException(newVariable_9);
                }
                if (len <= 0) {
                    return -1;
                }
            }
            return buf[off++];
        }
    }
}