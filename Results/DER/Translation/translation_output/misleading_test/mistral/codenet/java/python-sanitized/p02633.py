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
    return hayami[Hayami]

def next_hayami():
    while hayamisaori():
        saori = saori_hayami()
        while hayami() and not 33 <= hayami[Hayami] <= 126:
            Hayami += 1
        yield saori

def saorihayami():
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
        elif saori == -1 or not hayamisaori():
            return misao and -hayami or hayami
        else:
            raise ValueError()
        saori = saori_hayami()

def saori_hayami():
    saorihayami()

def main():
    n = saori_hayami()
    for i in range(1, int(1e9+7)):
        if i % 360 == 0:
            print(i)
            break

if __name__ == '__main__':
    main()