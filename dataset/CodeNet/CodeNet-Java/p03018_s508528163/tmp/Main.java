import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1 * 1024 * 1024).start();
System.out.println("[INST]7;None;new Thread(null, new Main(), '', 1 * 1024 * 1024).start();"+new Thread(null, new Main(), "", 1 * 1024 * 1024).start());
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        char[] s = sc.next().toCharArray();
        ArrayDeque<Character> q = new ArrayDeque<>();
        for(char c:s){
        	q.offerLast(c);
System.out.println("[INST]16;None;q.offerLast(c);"+q.offerLast(c));
        }
        
        long ans = 0;
        
    	int anum = 0;
    	
        loop:while(q.size()!=0){
System.out.println("[INST]23;None;q.size();"+q.size());
        	char now = 'A';
        	
        	while(now == 'A'){
        		if(q.size()==0){
System.out.println("[INST]27;None;q.size();"+q.size());
        			break loop;
        		}
        		now = q.pollFirst();
System.out.println("[INST]30;now;q.pollFirst();"+now);
        		if(now == 'A'){
        			anum++;
        		}
        	}
        	
        	if(now == 'B'){
        		if(q.size()==0){
System.out.println("[INST]37;None;q.size();"+q.size());
        			break loop;
        		}
        		now = q.peekFirst();
System.out.println("[INST]40;now;q.peekFirst();"+now);
        		
            	if(now == 'C'){
            		q.pollFirst();
System.out.println("[INST]43;None;q.pollFirst();"+q.pollFirst());
            		ans += anum;
            	}
            	else{ //A→B→AorB
            		anum = 0;
            	}
        	}
        	else{ //A→C
        		anum = 0;
        	}
        }
        
        System.out.println(ans);

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
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
System.out.println("[INST]74;buflen;in.read(buffer);"+buflen);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
System.out.println("[INST]104;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
			b = readByte();
		}
		return sb.toString();
System.out.println("[INST]107;None;sb.toString();"+sb.toString());
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}