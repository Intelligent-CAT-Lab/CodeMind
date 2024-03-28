class main:
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
                    self.hayami = []
                if not self.hayami:
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
                raise Exception("NoSuchElementException")
            hayami = []
            saori = self.SaoriHayami()
            while self.hayami_saori(saori):
                hayami.append(chr(saori))
                saori = self.SaoriHayami()
            return "".join(hayami)
    
        def saorihayami(self):
            hayami = self.nextHayami()
            try:
                return int(hayami)
            except:
                raise Exception("NumberFormatException")
    
        def saori_hayami(self):
            return self.saorihayami()
    
        def close(self):
            sys.stdin.close()
    
    
    def main():
        saori = Hayami()
        n = saori.saori_hayami()
        saori.close()
        i = 1
        while True:
            if (i * n) % 360 == 0:
                print(i)
                return
            i += 1
    
    
    if __name__ == "__main__":
        main()