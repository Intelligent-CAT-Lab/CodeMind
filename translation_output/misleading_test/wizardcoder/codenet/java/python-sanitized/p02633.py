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