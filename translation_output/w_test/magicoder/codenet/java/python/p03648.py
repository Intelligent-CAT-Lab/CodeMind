<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
4
3 3 3 3


```
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class p03648 {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		long K = sc.nextLong();
		long A = K/50;
		long B = K%50;
		
		long[] a = new long[50];
		for(int i=0; i<50; i++) {
			a[i] = i + A;
		}
		
		for(int i=49; i>49-B; i--) {
			a[i]++;
		}
		
		System.out.println(50);
		for(int i=0; i<50; i++) {
			System.out.print(a[i]);
			if(i != 49) {
				System.out.println(" ");
			}
		}
		System.out.println();
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
                b = readByte();
            }
            return sb.toString();
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

```

@@ Response
```python
import sys

def main():
    K = int(input())
    A = K // 50
    B = K % 50

    a = [i + A for i in range(50)]
    for i in range(49, 49 - B, -1):
        a[i] += 1

    print(50)
    print(*a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the values of A and B, creates a list a with values from 0 to 49 plus A, then increments the last B elements of a by 1. Finally, it prints the length of the list (which is always 50) and the elements of the list, separated by spaces.<｜end▁of▁sentence｜>
