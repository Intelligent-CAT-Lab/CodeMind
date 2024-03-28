class main:
    import sys
    
    class Hayami:
        def __init__(self):
            self.hayami = []
            self.hayami_index = 0
            self.saori = 0
    
        def HayamiSaori(self):
            if self.hayami_index < self.saori:
                return True
            else:
                self.hayami_index = 0
                try:
                    self.hayami = list(map(ord, sys.stdin.readline().strip()))
                    self.saori = len(self.hayami)
                except EOFError:
                    return False
                if self.saori <= 0:
                    return False
            return True
    
        def SaoriHayami(self):
            if self.HayamiSaori():
                return self.hayami[self.hayami_index]
            else:
                return -1
    
        def HayamiSaori(self, hayami):
            return 33 <= hayami and hayami <= 126
    
        def Hayamisaori(self):
            while self.HayamiSaori() and not self.HayamiSaori(self.hayami[self.hayami_index]):
                self.hayami_index += 1
            return self.HayamiSaori()
    
        def NextHayami(self):
            if not self.Hayamisaori():
                raise EOFError()
            hayami = []
            saori = self.SaoriHayami()
            while self.HayamiSaori(saori):
                hayami.append(chr(saori))
                saori = self.SaoriHayami()
            return ''.join(hayami)
    
        def SaoriHayami(self):
            if not self.Hayamisaori():
                raise EOFError()
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
                elif saori == -1 or not self.HayamiSaori(saori):
                    return -hayami if misao else hayami
                else:
                    raise ValueError()
                saori = self.SaoriHayami()
    
        def Hayami(self):
            return float(self.NextHayami())
    
        def close(self):
            sys.stdin.close()
    
    
    if __name__ == "__main__":
        hayami = Hayami()
        n = hayami.SaoriHayami()
        if n < 1000:
            print("ABC")
        else:
            print("ABD")
        hayami.close()