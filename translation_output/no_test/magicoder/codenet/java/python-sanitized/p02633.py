import sys

class Hayami:
    def __init__(self):
        self.hayami = sys.stdin.buffer.read()
        self.Hayami = 0
        self.saori = 0

    def HayamiSaori(self):
        if self.Hayami < self.saori:
            return True
        else:
            self.Hayami = 0
            self.saori = sys.stdin.buffer.read()
            if self.saori <= 0:
                return False
        return True

    def SaoriHayami(self):
        if self.HayamiSaori():
            return self.hayami[self.Hayami:self.Hayami+1]
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
            raise StopIteration()
        hayamin = []
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayamin.append(saori)
            saori = self.SaoriHayami()
        return ''.join(hayamin)

    def saorihayami(self):
        if not self.hayamisaori():
            raise StopIteration()
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == b'-':
            misao = True
            saori = self.SaoriHayami()
        if saori < b'0' or b'9' < saori:
            raise ValueError()
        while True:
            if b'0' <= saori and saori <= b'9':
                hayami *= 10
                hayami += int(saori) - int(b'0')
            elif saori == -1 or not self.hayami_saori(saori):
                return -hayami if misao else hayami
            else:
                raise ValueError()
            saori = self.SaoriHayami()

    def saori_hayami(self):
        hayami = self.saorihayami()
        if hayami < -2147483648 or hayami > 2147483647:
            raise ValueError()
        return int(hayami)

    def Hayamin(self):
        return float(self.nextHayami())

    def close(self):
        sys.stdin.close()


MOD = 1000000007
MAX = 2147483646


def main():
    saori = Hayami()
    n = saori.saori_hayami()
    saori.close()
    i = 1
    while True:
        if i * n % 360 == 0:
            print(i)
            return
        i += 1


if __name__ == "__main__":
    main()