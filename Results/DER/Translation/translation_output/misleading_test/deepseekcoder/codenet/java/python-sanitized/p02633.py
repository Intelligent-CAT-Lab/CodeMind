import sys

class Hayami:
    def __init__(self):
        self.hayami = []
        self.saori = 0

    def hayami_saori(self, hayami):
        return 33 <= hayami and hayami <= 126

    def HayamiSaori(self):
        if self.saori < len(self.hayami):
            return True
        else:
            self.saori = 0
            try:
                self.hayami = list(map(ord, sys.stdin.readline()))
            except:
                pass
            if len(self.hayami) <= 0:
                return False
        return True

    def SaoriHayami(self):
        if self.HayamiSaori():
            return self.hayami[self.saori]
        else:
            return -1

    def hayamisaori(self):
        while self.HayamiSaori() and not self.hayami_saori(self.hayami[self.saori]):
            self.saori += 1
        return self.HayamiSaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise StopIteration()
        hayami = []
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayami.append(chr(saori))
            saori = self.SaoriHayami()
        return ''.join(hayami)

    def saorihayami(self):
        if not self.hayamisaori():
            raise StopIteration()
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == '-':
            misao = True
            saori = self.SaoriHayami()
        if saori < '0' or '9' < saori:
            raise ValueError()
        while True:
            if '0' <= saori and saori <= '9':
                hayami *= 10
                hayami += ord(saori) - ord('0')
            elif saori == -1 or not self.hayami_saori(saori):
                return -hayami if misao else hayami
            else:
                raise ValueError()
            saori = self.SaoriHayami()

    def saori_hayami(self):
        hayami = self.saorihayami()
        if hayami < -2147483648 or hayami > 2147483647:
            raise ValueError()
        return hayami

    def Hayamin(self):
        return float(self.nextHayami())

saori = Hayami()
n = saori.saori_hayami()
i = 1
while True:
    if i*n % 360 == 0:
        print(i)
        break
    i += 1