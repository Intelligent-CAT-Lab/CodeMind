import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		char[] strz = sc.next().toCharArray();
		
		int min = 100;
		
		for(int i=0; i<26; i++) {
			char key = (char) ('a' + i);
			int cnt = 0;
			
			char[] str = new char[strz.length];
			
			for(int j=0; j<strz.length; j++) {
				str[j] = strz[j];
			}
			
			while(true) {
				
				boolean flag = false;

				for(int j=0; j<str.length; j++) {
					if(str[j] != key) {
						flag = true;
						break;
					}
				}
				
				if(!flag) {
//					System.out.println((char)key + " " + cnt);
					if(cnt < min) {
						min = cnt;
					}
					break;
				}
				
				char[] next = new char[str.length - 1];
			
				for(int j=0; j<next.length; j++) {
					if(str[j] == key || str[j+1] == key) {
						next[j] = key;
					} else {
						next[j] = (char) (key - 1);
					}
				}
				
				cnt++;
				
				if(next.length == 1) {
					break;
				}
				

//				System.out.println(next);
				
				str = next;
			}
		}
		
		System.out.println(min);
	}
	
	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
System.out.println("[INST]78;buflen;in.read(buffer);"+buflen);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
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
System.out.println("[INST]97;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
                b = readByte();
            }
            return sb.toString();
System.out.println("[INST]100;None;sb.toString();"+sb.toString());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}

