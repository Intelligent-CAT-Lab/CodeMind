import sys

def hayami():
    inp = sys.stdin
    hayami = bytearray(1024)
    Hayami = 0
    saori = 0
    while True:
        if Hayami < saori:
            return True
        else:
            Hayami = 0
            try:
                saori = inp.read(hayami)
            except Exception as e:
                print(e)
            if saori <= 0:
                return False
    return True

def saori_hayami():
    while hayami() and not 33 <= hayami[Hayami] <= 126:
        Hayami += 1
    return hayami[Hayami]

def next_hayami():
    while hayami() and not 33 <= hayami[Hayami] <= 126:
        Hayami += 1
    hayamin = ""
    saori = saori_hayami()
    while hayami() and 33 <= hayami[Hayami] <= 126:
        hayamin += chr(hayami[Hayami])
        saori = saori_hayami()
    return hayamin

def saorihayami():
    while hayami() and not 33 <= hayami[Hayami] <= 126:
        Hayami += 1
    misao = False
    saori = saori_hayami()
    if saori == '-':
        misao = True
        saori = saori_hayami()
    if not ('0' <= saori <= '9'):
        raise ValueError()
    hayami = 0
    while True:
        if '0' <= saori <= '9':
            hayami *= 10
            hayami += saori - '0'
        elif saori == -1 or not hayami_saori(saori):
            return misao if hayami else saori
        else:
            raise ValueError()
        saori = saori_hayami()

def saori_hayami():
    saorihayami()

def hayamisaori():
    while hayami() and not 33 <= hayami[Hayami] <= 126:
        Hayami += 1
    return hayami()

def main():
    hayami = hayami()
    if saori_hayami() < 1000:
        print("ABC")
    else:
        print("ABD")

if __name__ == "__main__":
    main()