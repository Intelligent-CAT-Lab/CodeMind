<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

MOD = 10**9+7 # 10^9+7
MAX = 2**31-1 # intMax 
INF = 10**9 # 10^9  

class hayami:
    def __init__(self):
        self.hayami = sys.stdin.read()
        self.saori = 0

    def HayamiSaori(self):
        if self.saori < len(self.hayami):
            return True
        else:
            self.saori = 0
            return False

    def SaoriHayami(self): 
        if self.HayamiSaori():
            return ord(self.hayami[self.saori])
        else:
            return -1

    @staticmethod
    def hayami_saori(hayami): 
        return 33 <= hayami and hayami <= 126

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
            self.saori += 1
            saori = self.SaoriHayami()
        return "".join(hayami)

    def saorihayami(self):#nextLong
        if not self.hayamisaori():
            raise Exception("NoSuchElementException")
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == ord('-'):
            misao = True
            self.saori += 1
            saori = self.SaoriHayami()
        if saori < ord('0') or ord('9') < saori:
            raise Exception("NumberFormatException")
        while True:
            if ord('0') <= saori and saori <= ord('9'):
                hayami *= 10
                hayami += saori - ord('0')
            elif saori == -1 or not self.hayami_saori(saori):
                return -hayami if misao else hayami
            else:
                raise Exception("NumberFormatException")
            self.saori += 1
            saori = self.SaoriHayami()

    def saori_hayami(self):#nextInt
        hayami = self.saorihayami()
        if hayami < -2**31 or hayami > 2**31-1:
            raise Exception("NumberFormatException")
        return int(hayami)

    def Hayamin(self): #nextDouble
        return float(self.nextHayami())

    def close(self):
        sys.stdin.close()


def main():
    saori = hayami()
    n = saori.saori_hayami()
    saori.close()
    i = 1
    while True:
        if i*n % 360 == 0:
            print(i)
            return
        i += 1

if __name__ == "__main__":
    main()
```
<|EOT|>
