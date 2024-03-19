<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999

Expected output:
ABqC

```
import java.io.*;
import java.util.*;
class p03327{
	static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intMax 
    static final int INF = 1_000_000_000; // 10^9  
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		int n = saori.saori_hayami();
		if(n < 1000){
			System.out.println("ABC");
		} else {
			System.out.println("ABD");
		}
		
		saori.close();
    }
}

class hayami implements Closeable {
	private final InputStream in = System.in;
	private final byte[] hayami = new byte[1024];
	private int Hayami = 0;
	private int saori = 0;
	private boolean HayamiSaori() {
		if (Hayami < saori) {
			return true;
		}else{
			Hayami = 0;
			try {
				saori = in.read(hayami);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (saori <= 0) {
				return false;
			}
		}
		return true;
	}
	private int SaoriHayami() { 
		if (HayamiSaori()) {
            return hayami[Hayami++];
         }else{
             return -1;
         }
	}
	private static boolean hayami_saori(int hayami) { 
		return 33 <= hayami && hayami <= 126;
	}
	public boolean hayamisaori() { 
		while(HayamiSaori() && !hayami_saori(hayami[Hayami])) Hayami++; return HayamiSaori();
	}
	public String nextHayami() {
		if (!hayamisaori()) throw new NoSuchElementException();
		StringBuilder hayamin = new StringBuilder();
		int saori = SaoriHayami();
		while(hayami_saori(saori)) {
			hayamin.appendCodePoint(saori);
			saori = SaoriHayami();
		}
		return hayamin.toString();
	}
	public long saorihayami() {//nextLong
		if (!hayamisaori()) throw new NoSuchElementException();
		long hayami = 0;
		boolean misao = false;
		int saori = SaoriHayami();
		if (saori == '-') {
			misao = true;
			saori = SaoriHayami();
		}
		if (saori < '0' || '9' < saori) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= saori && saori <= '9') {
				hayami *= 10;
				hayami += saori - '0';
			}else if(saori == -1 || !hayami_saori(saori)){
				return misao ? -hayami : hayami;
			}else{
				throw new NumberFormatException();
			}
			saori = SaoriHayami();
		}
	}
	public int saori_hayami() {//nextInt
		long hayami = saorihayami();
		if (hayami < Integer.MIN_VALUE || hayami > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) hayami;
	}
	public double Hayamin() { //nextDouble
		return Double.parseDouble(nextHayami());
	}
	public void close() {
		try {
			in.close();
		} catch (IOException e) {
		}
    }
    
}
```

@@ Response
Here is the Python equivalent of the given Java code:

```python
import sys

class Hayami:
    def __init__(self):
        self.hayami = sys.stdin.readline().strip()
        self.index = 0

    def hayami_saori(self, hayami):
        return 33 <= hayami and hayami <= 126

    def hayamisaori(self):
        while self.index < len(self.hayami) and not self.hayami_saori(ord(self.hayami[self.index])):
            self.index += 1
        return self.index < len(self.hayami)

    def next_hayami(self):
        if not self.hayamisaori():
            raise StopIteration
        hayamin = ""
        while self.hayamisaori() and self.hayami_saori(ord(self.hayami[self.index])):
            hayamin += self.hayami[self.index]
            self.index += 1
        return hayamin

    def saori_hayami(self):
        hayami = self.next_hayami()
        try:
            return int(hayami)
        except ValueError:
            raise ValueError("Invalid integer: " + hayami)

saori = Hayami()
n = saori.saori_hayami()
if n < 1000:
    print("ABC")
else:
    print("ABD")
```

This Python code reads a line from the standard input, and then checks if the number is less than 1000. If it is, it prints "ABC", otherwise it prints "ABD". The `saori_hayami` method reads an integer from the input and returns it. If the input is not a valid integer, it raises a `ValueError`.<｜end▁of▁sentence｜>
