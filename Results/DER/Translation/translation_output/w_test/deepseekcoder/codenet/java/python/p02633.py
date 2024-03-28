<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
90

Expected output:
4


```
import java.io.*;
import java.util.*;
class p02633{
	static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intMax 
    static final int INF = 1_000_000_000; // 10^9  
    public static void main(String[] args) throws Exception {
		hayami saori = new hayami();
		int n = saori.saori_hayami();
		saori.close();
		int i = 1;
		while(true){
			if(i*n % 360 == 0){
				System.out.println(i);
				return;
			}
			i++;
		}
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
        self.saori = 0

    def hayami_saori(self, hayami):
        return 33 <= hayami and hayami <= 126

    def HayamiSaori(self):
        if self.saori < len(self.hayami):
            return True
        else:
            self.saori = 0
            try:
                self.hayami = list(map(ord, sys.stdin.readline()))
            except:
                self.hayami = []
            if not self.hayami:
                return False
        return True

    def SaoriHayami(self):
        if self.HayamiSaori():
            return self.hayami[self.saori]
        else:
            return -1

    def hayamisaori(self):
        while self.HayamiSaori() and not self.hayami_saori(self.hayami[self.saori]):
            self.saori += 1
        return self.HayamiSaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise Exception("NoSuchElementException")
        hayami = []
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayami.append(chr(saori))
            saori = self.SaoriHayami()
        return "".join(hayami)

    def saorihayami(self):
        hayami = self.nextHayami()
        try:
            return int(hayami)
        except:
            raise Exception("NumberFormatException")

    def saori_hayami(self):
        return self.saorihayami()

    def close(self):
        sys.stdin.close()


def main():
    saori = Hayami()
    n = saori.saori_hayami()
    saori.close()
    i = 1
    while True:
        if (i * n) % 360 == 0:
            print(i)
            return
        i += 1


if __name__ == "__main__":
    main()
```

Please note that this Python code is a direct translation of the given Java code. It may not work as expected if the input format is different from the expected format in the Java code.
<|EOT|>
