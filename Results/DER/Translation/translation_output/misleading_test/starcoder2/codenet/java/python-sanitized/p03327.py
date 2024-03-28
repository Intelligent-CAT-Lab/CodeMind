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