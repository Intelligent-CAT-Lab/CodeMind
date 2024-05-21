class p03327:
    MOD = 10**9 + 7
    MAX = 2**31 - 1
    INF = 10**9

    @staticmethod
    def main():
        saori = hayami()
        n = saori.saori_hayami()
        if n < 1000:
            print("ABC")
        else:
            print("ABD")
        saori.close()

class hayami:
    def __init__(self):
        self.in_ = sys.stdin.buffer
        self.hayami = bytearray()
        self.Hayami = 0
        self.saori = 0

    def close(self):
        self.in_.close()

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

    def hayami_saori(self, hayami):
        return 33 <= hayami <= 126

    def hayamisaori(self):
        while self.HayamiSaori() and not self.hayami_saori(self.hayami[self.Hayami]):
            self.Hayami += 1
        return self.HayamiSaori()

    def nextHayami(self):
        if not self.hayamisaori():
            raise ValueError("No more input")
        hayamin = bytearray()
        saori = self.SaoriHayami()
        while self.hayami_saori(saori):
            hayamin.append(saori)