
```
import sys

class hayami:
    def __init__(self):
        self.hayami = sys.stdin.read()
        self.saori = 0
        self.Hayami = 0

    def hayamisaori(self):
        if self.Hayami < self.saori:
            return True
        else:
            self.Hayami = 0
            self.saori = len(self.hayami)
            if self.saori <= 0:
                return False
            return True

    def SaoriHayami(self):
        if self.hayamisaori():
            return self.hayami[self.Hayami]
        else:
            return -1

    def hayami_saori(self, hayami):
        return 33 <= hayami and hayami <= 126

    def hayamisaori(self):
        while self.hayamisaori() and not self.hayami_saori(self.hayami[self.Hayami]):
            self.Hayami += 1
        return self.hayamisaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise Exception("NoSuchElementException")
        hayamin = ""
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayamin += chr(saori)
            saori = self.SaoriHayami()
        return hayamin

    def saorihayami(self):
        if not self.hayamisaori():
            raise Exception("NoSuchElementException")
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == '-':
            misao = True
            saori = self.SaoriHayami()
        if saori < '0' or '9' < saori:
            raise Exception("NumberFormatException")
        while True:
            if '0' <= saori and saori <= '9':
                hayami *= 10
                hayami += saori - '0'
            elif saori == -1 or not self.hayami_saori(saori):
                return -hayami if misao else hayami
            else:
                raise Exception("NumberFormatException")
            saori = self.SaoriHayami()

    def saori_hayami(self):
        hayami = self.saorihayami()
        if hayami < -2147483648 or hayami > 2147483647:
            raise Exception("NumberFormatException")
        return int(hayami)

    def Hayamin(self):
        return float(self.nextHayami())

saori = hayami()
n = saori.saori_hayami()
if n < 1000:
    print("ABC")
else:
    print("ABD")
```

## 03328

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;
class p03328{
    static final long MOD = 1_000_000_007; // 10^9+7
    static final int MAX = 2_147_483_646; // intMax 
    static final int INF = 1_000_000_000; // 10^9  
    public static void main(String[] args) throws Exception {
        hayami saori = new hayami();
        int n = saori.saori_hayami();
        int m = saori.saori_hayami();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = saori.saori_hayami();
        }
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = saori.saori_hayami();
        }
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            c[i] = saori.saori_hayami();
        }
        int[] d = new int[m];
        for(int i = 0; i < m; i++){
            d[i] = saori.saori_hayami();
        }
        int[] e = new int[n];
        for(int i = 0; i < n; i++){
            e[i] = saori.saori_hayami();
        }
        int[] f = new int[m];
        for(int i = 0; i < m; i++){
            f[i] = sa
