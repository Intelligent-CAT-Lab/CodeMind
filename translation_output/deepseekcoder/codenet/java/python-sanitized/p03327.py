import sys

MOD = 10**9+7 # 10^9+7
MAX = 2**31-1 # intMax 

class Hayami:
    def __init__(self):
        self.hayami = sys.stdin.buffer.read
        self.Hayami = self.saori = 0

    def HayamiSaori(self):
        if self.Hayami < self.saori:
            return True
        else:
            self.Hayami = 0
            self.saori = self.hayami(1024)
            if self.saori <= 0:
                return False
            return True

    def SaoriHayami(self): 
        if self.HayamiSaori():
            return self.hayami[self.Hayami:self.Hayami+1]
        else:
            return -1

    def hayamisaori(self): 
        while self.HayamiSaori() and not self.hayami_saori(self.hayami[self.Hayami]):
            self.Hayami += 1
        return self.HayamiSaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise StopIteration()
        hayami = []
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayami.append(saori)
            saori = self.SaoriHayami()
        return ''.join(hayami)

    def saorihayami(self):#nextLong
        if not self.hayamisaori():
            raise StopIteration()
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == ord('-'):
            misao = True
            saori = self.SaoriHayami()
        if saori < ord('0') or ord('9') < saori:
            raise ValueError()
        while True:
            if ord('0') <= saori <= ord('9'):
                hayami *= 10
                hayami += saori - ord('0')
            elif saori == -1 or not self.hayami_saori(saori):
                return -hayami if misao else hayami
            else:
                raise ValueError()
            saori = self.SaoriHayami()

    def saori_hayami(self):#nextInt
        hayami = self.saorihayami()
        if hayami < -2**31 or hayami > 2**31-1:
            raise ValueError()
        return hayami

    def Hayamin(self): #nextDouble
        return float(self.nextHayami())

    def close(self):
        sys.stdin.close()

    def hayami_saori(self, hayami): 
        return 33 <= hayami and hayami <= 126


def main():
    saori = Hayami()
    n = saori.saori_hayami()
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
    saori.close()

if __name__ == "__main__":
    main()