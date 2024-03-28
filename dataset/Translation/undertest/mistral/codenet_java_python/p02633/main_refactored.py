class main:
    import sys
    
    def hayami():
        inp = sys.stdin
        hayami = bytearray(1024)
        Hayami = 0
        saori = 0
        while True:
            if Hayami < saori:
                return True
            Hayami = 0
            try:
                saori = inp.read(hayami)
            except Exception as e:
                print(e)
                return False
            if saori <= 0:
                return False
        return True
    
    def saori_hayami():
        while hayami() and not 33 <= hayami[Hayami] <= 126:
            Hayami += 1
        return hayami[Hayami]
    
    def hayamisaori():
        while hayami() and not 33 <= hayami[Hayami] <= 126:
            Hayami += 1
        return hayami[Hayami] != -1
    
    def next_hayami():
        while hayamisaori():
            saori = saori_hayami()
            yield saori
    
    def saorihayami():
        while hayamisaori():
            saori = saori_hayami()
            if saori == '-':
                continue
            if not '0' <= saori <= '9':
                raise ValueError
            yield int(saori)
    
    def saori_hayami():
        hayami = saorihayami()
        if hayami < 0 or hayami > 2**31 - 1:
            raise ValueError
        return int(hayami)
    
    def main():
        n = saori_hayami()
        for i in range(1, int(10**9+7) // 360 + 1):
            if i % 360 == 0:
                print(i)
                break
    
    if __name__ == '__main__':
        main()