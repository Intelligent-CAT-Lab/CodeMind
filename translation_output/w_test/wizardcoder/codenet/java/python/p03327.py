Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
		while(HayamiSaori() &&!hayami_saori(hayami[Hayami])) Hayami++; return HayamiSaori();
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
			}else if(saori == -1 ||!hayami_saori(saori)){
				return misao? -hayami : hayami;
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
import java.io.*;
import java.util.*;

class p03327:
    MOD = 1_000_000_007 # 10^9+7
    MAX = 2_147_483_646 # intMax 
    INF = 1_000_000_000 # 10^9  
    def main(self):
        saori = hayami()
        n = saori.saori_hayami()
        if n < 1000:
            print("ABC")
        else:
            print("ABD")
        saori.close()

class hayami(Closeable):
    in_stream = System.in
    hayami_buffer = bytearray(1024)
    Hayami = 0
    saori = 0
    def HayamiSaori(self):
        if Hayami < saori:
            return True
        else:
            Hayami = 0
            try:
                saori = self.in_stream.read(hayami_buffer)
            except IOException as e:
                e.printStackTrace()
            if saori <= 0:
                return False
        return True
    def SaoriHayami(self): 
        if HayamiSaori():
            return hayami_buffer[Hayami]
        else:
            return -1
    def hayami_saori(self, hayami): 
        return 33 <= hayami and hayami <= 126
    def hayamisaori(self): 
        while(HayamiSaori() and not self.hayami_saori(hayami_buffer[Hayami])):
            Hayami += 1
        return HayamiSaori()
    def nextHayami(self):
        if not self.hayamisaori():
            raise NoSuchElementException()
        hayamin = StringBuilder()
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayamin.appendCodePoint(saori)
            saori = self.SaoriHayami()
        return hayamin.toString()
    def saorihayami(self): #nextLong
        if not self.hayamisaori():
            raise NoSuchElementException()
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == '-':
            misao = True
            saori = self.SaoriHayami()
        if saori < '0' or '9' < saori:
            raise NumberFormatException()
        while True:
            if '0' <= saori and saori <= '9':
                hayami *= 10
                hayami += saori - '0'
            elif saori == -1 or not self.hayami_saori(saori):
                return -hayami if misao else hayami
            else:
                raise NumberFormatException()
            saori = self.SaoriHayami()
    def saori_hayami(self): #nextInt
        hayami = self.saorihayami()
        if hayami < Integer.MIN_VALUE or hayami > Integer.MAX_VALUE:
            raise NumberFormatException()
        return int(hayami)
    def Hayamin(self): #nextDouble
        return Double.parseDouble(self.nextHayami())
    def close(self):
        try:
            self.in_stream.close()
        except IOException as e:
            e.printStackTrace()

p03327().main()
```<|endoftext|>
