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