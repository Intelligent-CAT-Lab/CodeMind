<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解答

```python
import java.io;
import java.util;

class p03327:
    def main(self, args):
        saori = hayami()
        n = saori.saori_hayami()
        if n < 1000:
            print("ABC")
        else:
            print("ABD")
        saori.close()

    class hayami:
        def __init__(self):
            self.in = sys.stdin
            self.hayami = bytearray(1024)
            self.Hayami = 0
            self.saori = 0

        def HayamiSaori(self):
            if self.Hayami < self.saori:
                return True
            else:
                self.Hayami = 0
                try:
                    self.saori = self.in.read(self.hayami)
                except IOError:
                    pass
                if self.saori <= 0:
                    return False
            return True

        def SaoriHayami(self):
            if self.HayamiSaori():
                return self.hayami[self.Hayami]
            else:
                return -1

        def hayamisaori(self):
            while self.HayamiSaori() and not hayami_saori(self.hayami[self.Hayami]):
                self.Hayami += 1
            return self.HayamiSaori()

        def nextHayami(self):
            if not self.hayamisaori():
                raise NoSuchElementException
            hayamin = ""
            saori = self.SaoriHayami()
            while hayami_saori(saori):
                hayamin += chr(saori)
                saori = self.SaoriHayami()
            return hayamin

        def saorihayami(self):
            if not self.hayamisaori():
                raise NoSuchElementException
            hayami = 0
            misao = False
            saori = self.SaoriHayami()
            if saori == "-":
                misao = True
                saori = self.SaoriHayami()
            if saori < "0" or "9" < saori:
                raise NumberFormatException
            while True:
                if "0" <= saori and saori <= "9":
                    hayami *= 10
                    hayami += saori - "0"
                else if saori == -1 or not hayami_saori(saori):
                    return misao and -hayami or hayami
                else:
                    raise NumberFormatException
                saori = self.SaoriHayami()

        def saori_hayami(self):
            hayami = self.saorihayami()
            if hayami < Integer.MIN_VALUE or hayami > Integer.MAX_VALUE:
                raise NumberFormatException
            return int(hayami)

        def Hayamin(self):
            return float(nextHayami())

        def close(self):
            try:
                self.in.close()
            except IOError:
                pass
```

### 解説

```python
import java.io;
import java.util;

class p03327:
    def main(self, args):
        saori = hayami()
        n = saori.saori_hayami()
        if n < 1000:
            print("ABC")
        else:
            print("ABD")
        saori.close()

    class hayami:
        def __init__(self):
            self.in = sys.stdin
            self.hayami = bytearray(1024)
            self.Hayami = 0
            self.saori = 0

        def HayamiSa
