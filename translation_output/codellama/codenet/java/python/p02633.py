<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

class Hayami:
    def __init__(self):
        self.hayami = []
        self.saori = 0
        self.hayami_saori = False

    def hayami_saori(self, hayami):
        return 33 <= hayami <= 126

    def saori_hayami(self):
        if self.hayami_saori:
            return self.hayami[self.saori]
        else:
            return -1

    def next_hayami(self):
        if not self.hayami_saori:
            raise NoSuchElementException
        hayamin = ""
        saori = self.saori_hayami()
        while self.hayami_saori(saori):
            hayamin += chr(saori)
            saori = self.saori_hayami()
        return hayamin

    def saorihayami(self):
        if not self.hayami_saori:
            raise NoSuchElementException
        hayami = 0
        misao = False
        saori = self.saori_hayami()
        if saori == "-":
            misao = True
            saori = self.saori_hayami()
        if saori < "0" or "9" < saori:
            raise NumberFormatException
        while True:
            if "0" <= saori and saori <= "9":
                hayami *= 10
                hayami += saori - "0"
            elif saori == -1 or not self.hayami_saori(saori):
                return misao * -hayami if misao else hayami
            else:
                raise NumberFormatException
            saori = self.saori_hayami()

    def saori_hayami(self):
        if not self.hayami_saori:
            raise NoSuchElementException
        hayami = 0
        misao = False
        saori = self.saori_hayami()
        if saori == "-":
            misao = True
            saori = self.saori_hayami()
        if saori < "0" or "9" < saori:
            raise NumberFormatException
        while True:
            if "0" <= saori and saori <= "9":
                hayami *= 10
                hayami += saori - "0"
            elif saori == -1 or not self.hayami_saori(saori):
                return misao * -hayami if misao else hayami
            else:
                raise NumberFormatException
            saori = self.saori_hayami()

    def next_double(self):
        return float(self.next_hayami())

    def close(self):
        try:
            sys.stdin.close()
        except IOError:
            pass

if __name__ == "__main__":
    hayami = Hayami()
    n = hayami.saori_hayami()
    hayami.close()
    i = 1
    while True:
        if i * n % 360 == 0:
            print(i)
            break
        i += 1
```
This is the Python code equivalent to the Java code you provided. I have used the same class and method names as in the Java code, but I have made some changes to the code to make it more Pythonic.

For example, in Python, we don't need to use the `static` keyword to declare class variables, and we can use the `with` statement to automatically close the input stream when we are done with it.

I have also used the `chr` function to convert the integer value of a character to
