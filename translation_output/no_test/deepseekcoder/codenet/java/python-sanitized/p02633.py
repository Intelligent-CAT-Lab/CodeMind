import sys

MOD = 10**9+7 # 10^9+7
MAX = 2**31-1 # intMax 

class hayami:
    def __init__(self):
        self.hayami = sys.stdin.read()
        self.saori = 0

    def HayamiSaori(self):
        if self.saori < len(self.hayami):
            return True
        else:
            self.saori = 0
            return False

    def SaoriHayami(self): 
        if self.HayamiSaori():
            return ord(self.hayami[self.saori])
        else:
            return -1

    @staticmethod
    def hayami_saori(hayami): 
        return 33 <= hayami and hayami <= 126

    def hayamisaori(self): 
        while self.HayamiSaori() and not self.hayami_saori(self.hayami[self.saori]):
            self.saori += 1
        return self.HayamiSaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise Exception("NoSuchElementException")
        hayami = []
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayami.append(chr(saori))
            self.saori += 1
            saori = self.SaoriHayami()
        return "".join(hayami)

    def saorihayami(self):#nextLong
        if not self.hayamisaori():
            raise Exception("NoSuchElementException")
        hayami = 0
        misao = False
        saori = self.SaoriHayami()
        if saori == ord('-'):
            misao = True
            self.saori += 1
            saori = self.SaoriHayami()
        if saori < ord('0') or ord('9') < saori:
            raise Exception("NumberFormatException")
        while True:
            if ord('0') <= saori and saori <= ord('9'):
                hayami *= 10
                hayami += saori - ord('0')
            elif saori == -1 or not self.hayami_saori(saori):
                return -hayami if misao else hayami
            else:
                raise Exception("NumberFormatException")
            self.saori += 1
            saori = self.SaoriHayami()

    def saori_hayami(self):#nextInt
        hayami = self.saorihayami()
        if hayami < -2**31 or hayami > 2**31-1:
            raise Exception("NumberFormatException")
        return int(hayami)

    def Hayamin(self): #nextDouble
        return float(self.nextHayami())

    def close(self):
        sys.stdin.close()


def main():
    saori = hayami()
    n = saori.saori_hayami()
    saori.close()
    i = 1
    while True:
        if i*n % 360 == 0:
            print(i)
            return
        i += 1

if __name__ == "__main__":
    main()