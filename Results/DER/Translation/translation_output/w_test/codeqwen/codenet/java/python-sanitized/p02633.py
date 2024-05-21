class p02633:
    MOD = 10**9 + 7
    MAX = 2**31 - 1
    INF = 10**9

    @staticmethod
    def main():
        saori = hayami()
        n = saori.saori_hayami()
        saori.close()
        i = 1
        while True:
            if i * n % 360 == 0:
                print(i)
                return
            i += 1


class hayami:
    def __init__(self):
        self.in_ = sys.stdin
        self.hayami = bytearray(1024)
        self.Hayami = 0
        self.saori = 0

    def HayamiSaori(self):
        if self.Hayami < self.saori:
            return True
        else:
            self.Hayami = 0
            try:
                self.saori = self.in_.readinto(self.hayami)
            except IOError as e:
                print(e)
                return False
            if self.saori <= 0:
                return False
        return True

    def SaoriHayami(self):
        if self.HayamiSaori():
            return self.hayami[self.Hayami]
        else:
            return -1

    @staticmethod
    def hayami_saori(hayami):
        return 33 <= hayami <= 126

    def hayamisaori(self):
        while self.HayamiSaori() and not hayami.hayami_saori(self.hayami[self.Hayami]):
            self.Hayami += 1
        return self.HayamiSaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise ValueError("No such element")
        hayamin = ""
        saori = self.SaoriHayami()
        while hayami.hayami_saori(saori):
            hayamin