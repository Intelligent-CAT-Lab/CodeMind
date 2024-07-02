import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        Stack<String> stack = new Stack<>();
        String S = sc.next();
        String before = S.substring(0,1);
System.out.println("[INST]12;before;S.substring(0,1);"+before);
        stack.push(before);
System.out.println("[INST]13;None;stack.push(before);"+stack.push(before));
        String candidate = S.substring(1,2);
System.out.println("[INST]14;candidate;S.substring(1,2);"+candidate);
        int start;
        if(before.equals(candidate)) {
System.out.println("[INST]16;None;before.equals(candidate);"+before.equals(candidate));
            before = candidate.concat(S.substring(2,3));
System.out.println("[INST]17;before;candidate.concat(S.substring(2,3));"+before);
System.out.println("[INST]17;None;S.substring(2,3);"+S.substring(2,3));
            stack.push(before);
System.out.println("[INST]18;None;stack.push(before);"+stack.push(before));
            start = 3;
            candidate = null;
        } else {
            start = 2;
            stack.push(candidate);
System.out.println("[INST]23;None;stack.push(candidate);"+stack.push(candidate));
            before = candidate;
            candidate = null;
        }
        for(int i=start; i<S.length(); i++) {
System.out.println("[INST]27;None;S.length();"+S.length());
            candidate = candidate == null ? S.substring(i, i+1) : candidate.concat(S.substring(i, i+1));
System.out.println("[INST]28;None;S.substring(i, i+1);"+S.substring(i, i+1));
System.out.println("[INST]28;None;candidate.concat(S.substring(i, i+1));"+candidate.concat(S.substring(i, i+1)));
System.out.println("[INST]28;None;S.substring(i, i+1);"+S.substring(i, i+1));
            if(!candidate.equals(before)) {
System.out.println("[INST]29;None;candidate.equals(before);"+candidate.equals(before));
                stack.push(candidate);
System.out.println("[INST]30;None;stack.push(candidate);"+stack.push(candidate));
                before = candidate;
                candidate = null;
            }
        }
//        out.println(stack);
        out.println(stack.size());
        out.flush();
System.out.println("[INST]37;None;out.flush();"+out.flush());
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
System.out.println("[INST]52;buflen;in.read(buffer);"+buflen);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
System.out.println("[INST]70;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
            b = readByte();
        }
        return sb.toString();
System.out.println("[INST]73;None;sb.toString();"+sb.toString());
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
