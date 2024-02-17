
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static Scanner stdIn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();

	
	public static void main(String[] args) {
		char[] str = stdIn.nextLine().toCharArray();
		for(int i = 0; i < str.length; i++) {
			int A = 0;
			int I = 0;
			int D = 0;
			int U = 0;
			int N = 0;
			int Y = 0;
			for(int j = 0; j < 8; j++) {
				if(i + j >= str.length) break;
				if(str[i + j] == 'A') A++;
				if(str[i + j] == 'I') I++;
				if(str[i + j] == 'D') D++;
				if(str[i + j] == 'U') U++;
				if(str[i + j] == 'N') N++;
				if(str[i + j] == 'Y') Y++;
			}
			
			if(A == 2 && I == 1 && D == 1 && I == 1 && N == 2 && Y == 1&& U == 1) {
				str[i] = 'A';
				str[i+1] = 'I';
				str[i+2] = 'Z';
				str[i+3] = 'U';
				str[i+4] = 'N';
				str[i+5] = 'Y';
				str[i+6] = 'A';
				str[i+7] = 'N';
				i += 7;
			}
		}
		out.println(String.valueOf(str));
		
		out.flush();
		
		
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
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
        return (int)nextLong();
    }
     
    public double nextDouble() {
        return Double.parseDouble(next());
    }
     
 
}