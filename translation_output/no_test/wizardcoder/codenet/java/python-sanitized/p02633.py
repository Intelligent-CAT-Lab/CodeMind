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
        while True:
            if i*n % 360 == 0:
                print(i)
                return
            i += 1

class hayami(Closeable):
    in_ = System.in
    hayami_ = bytearray(1024)
    Hayami = 0
    saori = 0
    def HayamiSaori(self):
        if self.Hayami < self.saori:
            return True
        else:
            self.Hayami = 0
            try:
                self.saori = self.in_.read(self.hayami_)
            except IOException as e:
                e.printStackTrace()
            if self.saori <= 0:
                return False
        return True
    def SaoriHayami(self): 
        if self.HayamiSaori():
            return self.hayami_[self.Hayami]
        else:
            return -1
    def hayami_saori(self, hayami): 
        return 33 <= hayami and hayami <= 126
    def hayamisaori(self): 
        while self.HayamiSaori() and not self.hayami_saori(self.hayami_[self.Hayami]):
            self.Hayami += 1
        return self.HayamiSaori()
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
                return misao and -hayami or hayami
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
            self.in_.close()
        except IOException as e:
            pass

p02633().main()