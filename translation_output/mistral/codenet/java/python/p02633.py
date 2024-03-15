<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def hayami():
    inp = sys.stdin
    hayami = bytearray(1024)
    Hayami = 0
    saori = 0
    while True:
        if Hayami < saori:
            return True
        Hayami = 0
        try:
            saori = inp.read(hayami)
        except Exception as e:
            print(e)
            return False
        if saori <= 0:
            return False
    return True

def saori_hayami():
    while hayami() and not 33 <= hayami[Hayami] <= 126:
        Hayami += 1
    return hayami[Hayami]

def hayamisaori():
    while hayami() and not 33 <= hayami[Hayami] <= 126:
        Hayami += 1
    return hayami[Hayami]

def next_hayami():
    while hayamisaori():
        saori = saori_hayami()
        while hayami() and not 33 <= hayami[Hayami] <= 126:
            Hayami += 1
        yield saori

def saorihayami():
    misao = False
    saori = saori_hayami()
    if saori == '-':
        misao = True
        saori = saori_hayami()
    if not ('0' <= saori <= '9'):
        raise ValueError()
    hayami = 0
    while True:
        if '0' <= saori <= '9':
            hayami *= 10
            hayami += saori - '0'
        elif saori == -1 or not hayami_saori(saori):
            return misao and -hayami or hayami
        else:
            raise ValueError()
        saori = saori_hayami()

def saori_hayami():
    hayami = saorihayami()
    if hayami < min(-sys.maxsize) or hayami > sys.maxsize:
        raise ValueError()
    return int(hayami)

def hayamin():
    return next_hayami()

def close():
    sys.stdin.close()

if __name__ == '__main__':
    hayami = hayami()
    i = 1
    while True:
        if i * saori_hayami() % 360 == 0:
            print(i)
            break
        i += 1
```</s>
