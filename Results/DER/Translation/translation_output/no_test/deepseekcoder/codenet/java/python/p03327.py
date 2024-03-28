<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

MOD = 10**9+7 # 10^9+7
MAX = 2**31-1 # intMax 
INF = 10**9 # 10^9  

class Hayami:
    def __init__(self):
        self.hayami = sys.stdin.buffer.read
        self.Hayami = self.saori = 0

    def HayamiSaori(self):
        if self.Hayami < self.saori:
            return True
        else:
            self.Hayami = 0
            self.saori = self.hayami(1024)
            if self.saori <= 0:
                return False
            return True

    def SaoriHayami(self): 
        if self.HayamiSaori():
            return self.hayami[self.Hayami:self.Hayami+1]
        else:
            return -1

    def hayamisaori(self): 
        while self.HayamiSaori() and not self.hayami_saori(self.hayami[self.Hayami]):
            self.Hayami += 1
        return self.HayamiSaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise StopIteration()
        hayami = []
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayami.append(saori)
            saori = self.SaoriHayami()
        return ''.join(hayami)

    def saorihayami(self):#nextLong
        if not self.hayamisaori():
            raise StopIteration()
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == ord('-'):
            misao = True
            saori = self.SaoriHayami()
        if saori < ord('0') or ord('9') < saori:
            raise ValueError()
        while True:
            if ord('0') <= saori <= ord('9'):
                hayami *= 10
                hayami += saori - ord('0')
            elif saori == -1 or not self.hayami_saori(saori):
                return -hayami if misao else hayami
            else:
                raise ValueError()
            saori = self.SaoriHayami()

    def saori_hayami(self):#nextInt
        hayami = self.saorihayami()
        if hayami < -2**31 or hayami > 2**31-1:
            raise ValueError()
        return hayami

    def Hayamin(self): #nextDouble
        return float(self.nextHayami())

    def close(self):
        sys.stdin.close()

    def hayami_saori(self, hayami): 
        return 33 <= hayami and hayami <= 126


def main():
    saori = Hayami()
    n = saori.saori_hayami()
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
    saori.close()

if __name__ == "__main__":
    main()
```
<|EOT|>
