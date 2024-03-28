<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999

Expected output:
ABC


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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class Hayami:
    def __init__(self):
        self.hayami = sys.stdin.readline().strip()
        self.hayami_len = len(self.hayami)
        self.hayami_idx = 0

    def hayami_saori(self):
        if self.hayami_idx < self.hayami_len:
            return True
        else:
            return False

    def saori_hayami(self):
        if self.hayami_saori():
            return int(self.hayami[self.hayami_idx])
        else:
            return -1

    def next_hayami(self):
        if not self.hayami_saori():
            raise NoSuchElementException
        hayami = ""
        saori = self.saori_hayami()
        while saori != -1 and self.hayami_saori():
            hayami += chr(saori)
            saori = self.saori_hayami()
        return hayami

    def saorihayami(self):
        if not self.hayami_saori():
            raise NoSuchElementException
        hayami = 0
        misao = False
        saori = self.saori_hayami()
        if saori == "-":
            misao = True
            saori = self.saori_hayami()
        if saori < "0" or saori > "9":
            raise NumberFormatException
        while True:
            if "0" <= saori and saori <= "9":
                hayami *= 10
                hayami += saori - "0"
            elif saori == -1 or not self.hayami_saori():
                return misao * -hayami
            else:
                raise NumberFormatException
            saori = self.saori_hayami()

    def saori_hayami(self):
        hayami = self.saorihayami()
        if hayami < Integer.MIN_VALUE or hayami > Integer.MAX_VALUE:
            raise NumberFormatException
        return int(hayami)

    def hayamin(self):
        return float(self.next_hayami())

    def close(self):
        try:
            sys.stdin.close()
        except IOError:
            pass

if __name__ == "__main__":
    hayami = Hayami()
    n = hayami.saori_hayami()
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
    hayami.close()
```
Note that the Python code uses the `sys` module to read from standard input and the `chr` function to convert a character code to a character. The `hayami_saori` method is not used in the Python code, as it is not necessary to check if the hayami is a saori.</s>
