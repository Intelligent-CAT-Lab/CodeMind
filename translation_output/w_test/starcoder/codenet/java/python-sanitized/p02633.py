import sys

class hayami:
    def __init__(self):
        self.hayami = sys.stdin.buffer.read()
        self.saori = 0
        self.Hayami = 0

    def HayamiSaori(self):
        if self.Hayami < self.saori:
            return True
        else:
            self.Hayami = 0
            self.saori = self.hayami.readinto(self.hayami)
            if self.saori <= 0:
                return False
            else:
                return True

    def SaoriHayami(self):
        if self.HayamiSaori():
            return self.hayami[self.Hayami]
        else:
            return -1

    def hayami_saori(self, hayami):
        return 33 <= hayami and hayami <= 126

    def hayamisaori(self):
        while self.HayamiSaori() and not self.hayami_saori(self.hayami[self.Hayami]):
            self.Hayami += 1
        return self.HayamiSaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise Exception("No hayami")
        hayamin = ""
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayamin += chr(saori)
            saori = self.SaoriHayami()
        return hayamin

    def saorihayami(self):
        if not self.hayamisaori():
            raise Exception("No hayami")
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == '-':
            misao = True
            saori = self.SaoriHayami()
        if saori < '0' or '9' < saori:
            raise Exception("No hayami")
        while True:
            if '0' <= saori and saori <= '9':
                hayami *= 10
                hayami += saori - '0'
            elif saori == -1 or not self.hayami_saori(saori):
                return misao and -hayami or hayami
            else:
                raise Exception("No hayami")
            saori = self.SaoriHayami()

    def saori_hayami(self):
        hayami = self.saorihayami()
        if hayami < -2147483648 or 2147483647 < hayami:
            raise Exception("No hayami")
        return int(hayami)

    def Hayamin(self):
        return float(self.nextHayami())

    def close(self):
        self.hayami.close()

saori = hayami()
n = saori.saori_hayami()
saori.close()
i = 1
while True:
    if i * n % 360 == 0:
        print(i)
        break
    i += 1