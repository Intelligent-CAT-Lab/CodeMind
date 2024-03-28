class main:
    import sys
    
    class Hayami:
        def __init__(self):
            self.hayami = sys.stdin.readline().strip()
            self.hayami_len = len(self.hayami)
            self.hayami_idx = 0
    
        def hayami_saori(self):
            if self.hayami_idx < self.hayami_len:
                return True
            else:
                return False
    
        def saori_hayami(self):
            if self.hayami_saori():
                return int(self.hayami[self.hayami_idx])
            else:
                return -1
    
        def next_hayami(self):
            if not self.hayami_saori():
                raise NoSuchElementException
            hayami = ""
            saori = self.saori_hayami()
            while saori != -1 and self.hayami_saori():
                hayami += chr(saori)
                saori = self.saori_hayami()
            return hayami
    
        def saorihayami(self):
            if not self.hayami_saori():
                raise NoSuchElementException
            hayami = 0
            misao = False
            saori = self.saori_hayami()
            if saori == "-":
                misao = True
                saori = self.saori_hayami()
            if saori < "0" or saori > "9":
                raise NumberFormatException
            while True:
                if "0" <= saori and saori <= "9":
                    hayami *= 10
                    hayami += saori - "0"
                elif saori == -1 or not self.hayami_saori():
                    return misao * -hayami
                else:
                    raise NumberFormatException
                saori = self.saori_hayami()
    
        def saori_hayami(self):
            hayami = self.saorihayami()
            if hayami < Integer.MIN_VALUE or hayami > Integer.MAX_VALUE:
                raise NumberFormatException
            return int(hayami)
    
        def hayamin(self):
            return float(self.next_hayami())
    
        def close(self):
            try:
                sys.stdin.close()
            except IOError:
                pass
    
    if __name__ == "__main__":
        hayami = Hayami()
        n = hayami.saori_hayami()
        if n < 1000:
            print("ABC")
        else:
            print("ABD")
        hayami.close()