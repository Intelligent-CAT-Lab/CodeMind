Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
90

Expected output:
-73

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

class p02633:
    MOD = 1_000_000_007 # 10^9+7
    MAX = 2_147_483_646 # intMax 
    INF = 1_000_000_000 # 10^9  
    def main(self):
        saori = hayami()
        n = saori.saori_hayami()
        saori.close()
        i = 1
        while(True):
            if i*n % 360 == 0:
                print(i)
                return
            i += 1
    
    def hayami(self):
        in_stream = System.in
        hayami_stream = in_stream.read(1024)
        Hayami = 0
        saori = 0
        def HayamiSaori():
            if Hayami < saori:
                return True
            else:
                Hayami = 0
                try:
                    saori = in_stream.read(hayami_stream)
                except IOException as e:
                    e.printStackTrace()
                if saori <= 0:
                    return False
            return True
        
        def SaoriHayami():
            if HayamiSaori():
                return hayami_stream[Hayami]
            else:
                return -1
        
        def hayami_saori(hayami):
            return 33 <= hayami and hayami <= 126
        
        def hayamisaori():
            while(HayamiSaori() and not hayami_saori(hayami_stream[Hayami])):
                Hayami += 1
            return HayamiSaori()
        
        def nextHayami():
            if not hayamisaori():
                raise NoSuchElementException()
            hayamin = StringBuilder()
            saori = SaoriHayami()
            while(hayami_saori(saori)):
                hayamin.appendCodePoint(saori)
                saori = SaoriHayami()
            return hayamin.toString()
        
        def saorihayami():
            if not hayamisaori():
                raise NoSuchElementException()
            hayami = 0
            misao = False
            saori = SaoriHayami()
            if saori == '-':
                misao = True
                saori = SaoriHayami()
            if saori < '0' or '9' < saori:
                raise NumberFormatException()
            while(True):
                if '0' <= saori and saori <= '9':
                    hayami *= 10
                    hayami += saori - '0'
                elif saori == -1 or not hayami_saori(saori):
                    return misao and -hayami or hayami
                else:
                    raise NumberFormatException()
                saori = SaoriHayami()
        
        def saori_hayami():
            hayami = saorihayami()
            if hayami < Integer.MIN_VALUE or hayami > Integer.MAX_VALUE:
                raise NumberFormatException()
            return int(hayami)
        
        def Hayamin():
            return Double.parseDouble(nextHayami())
        
        def close():
            try:
                in_stream.close()
            except IOException as e:
                e.printStackTrace()
        
        return type('hayami', (object,), {'HayamiSaori': HayamiSaori, 'SaoriHayami': SaoriHayami, 'hayami_saori': hayami_saori, 'hayamisaori': hayamisaori, 'nextHayami': nextHayami,'saorihayami': saorihayami,'saori_hayami': saori_hayami, 'Hayamin': Hayamin, 'close': close})()

p02633().main()
```<|endoftext|>
