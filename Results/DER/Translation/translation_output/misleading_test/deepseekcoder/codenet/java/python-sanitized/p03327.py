import sys

class Hayami:
    def __init__(self):
        self.hayami = []
        self.saori = 0
        self.Hayami = 0

    def HayamiSaori(self):
        if self.Hayami < self.saori:
            return True
        else:
            self.Hayami = 0
            try:
                self.saori = sys.stdin.read(1024)
            except:
                self.saori = ""
            if self.saori == "":
                return False
            return True

    def SaoriHayami(self):
        if self.HayamiSaori():
            return ord(self.hayami[self.Hayami])
        else:
            return -1

    def hayamisaori(self):
        while self.HayamiSaori() and not self.hayami_saori(self.hayami[self.Hayami]):
            self.Hayami += 1
        return self.HayamiSaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise Exception("NoSuchElementException")
        hayami = []
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayami.append(chr(saori))
            saori = self.SaoriHayami()
        return "".join(hayami)

    def saorihayami(self):
        if not self.hayamisaori():
            raise Exception("NoSuchElementException")
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == '-':
            misao = True
            saori = self.SaoriHayami()
        if not self.hayami_saori(saori):
            raise Exception("NumberFormatException")
        while True:
            if '0' <= saori <= '9':
                hayami *= 10
                hayami += saori - '0'
            elif saori == -1 or not self.hayami_saori(saori):
                return hayami if not misao else -hayami
            else:
                raise Exception("NumberFormatException")
            saori = self.SaoriHayami()

    def saori_hayami(self):
        return int(self.saorihayami())

    def Hayamin(self):
        return float(self.nextHayami())

    def close(self):
        try:
            sys.stdin.close()
        except:
            pass

    def hayami_saori(self, hayami):
        return 33 <= hayami and hayami <= 126


if __name__ == "__main__":
    saori = Hayami()
    n = saori.saori_hayami()
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
    saori.close()