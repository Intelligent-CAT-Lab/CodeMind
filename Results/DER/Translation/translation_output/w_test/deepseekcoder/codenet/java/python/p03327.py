<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

class Hayami:
    def __init__(self):
        self.hayami = []
        self.hayami_index = 0
        self.saori = 0

    def HayamiSaori(self):
        if self.hayami_index < self.saori:
            return True
        else:
            self.hayami_index = 0
            try:
                self.hayami = list(map(ord, sys.stdin.readline().strip()))
                self.saori = len(self.hayami)
            except EOFError:
                return False
            if self.saori <= 0:
                return False
        return True

    def SaoriHayami(self):
        if self.HayamiSaori():
            return self.hayami[self.hayami_index]
        else:
            return -1

    def HayamiSaori(self, hayami):
        return 33 <= hayami and hayami <= 126

    def Hayamisaori(self):
        while self.HayamiSaori() and not self.HayamiSaori(self.hayami[self.hayami_index]):
            self.hayami_index += 1
        return self.HayamiSaori()

    def NextHayami(self):
        if not self.Hayamisaori():
            raise EOFError()
        hayami = []
        saori = self.SaoriHayami()
        while self.HayamiSaori(saori):
            hayami.append(chr(saori))
            saori = self.SaoriHayami()
        return ''.join(hayami)

    def SaoriHayami(self):
        if not self.Hayamisaori():
            raise EOFError()
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == '-':
            misao = True
            saori = self.SaoriHayami()
        if saori < '0' or '9' < saori:
            raise ValueError()
        while True:
            if '0' <= saori and saori <= '9':
                hayami *= 10
                hayami += ord(saori) - ord('0')
            elif saori == -1 or not self.HayamiSaori(saori):
                return -hayami if misao else hayami
            else:
                raise ValueError()
            saori = self.SaoriHayami()

    def Hayami(self):
        return float(self.NextHayami())

    def close(self):
        sys.stdin.close()


if __name__ == "__main__":
    hayami = Hayami()
    n = hayami.SaoriHayami()
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
    hayami.close()
```

This Python code does the same thing as the provided Java code. It reads input from the standard input, converts it to the appropriate data type, and prints the output to the standard output. The main difference is that Python uses `sys.stdin.readline()` to read input and `print()` to print output, whereas Java uses `System.out.println()` for printing and `BufferedReader` for reading input.
<|EOT|>
