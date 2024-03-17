import sys

def hayami_saori(hayami):
    return 33 <= hayami and hayami <= 126

def hayami_next():
    hayami = []
    saori = 0
    while True:
        if hayami_saori(saori):
            hayami.append(saori)
            saori = hayami_next()
        else:
            break
    return hayami

def hayami_saori_next():
    hayami = []
    saori = 0
    while True:
        if hayami_saori(saori):
            hayami.append(saori)
            saori = hayami_next()
        else:
            break
    return hayami

def hayami_next_long():
    hayami = []
    saori = 0
    while True:
        if hayami_saori(saori):
            hayami.append(saori)
            saori = hayami_next()
        else:
            break
    return hayami

def hayami_saori_next_long():
    hayami = []
    saori = 0
    while True:
        if hayami_saori(saori):
            hayami.append(saori)
            saori = hayami_next()
        else:
            break
    return hayami

def hayami_next_int():
    hayami = hayami_saori_next_long()
    if hayami[0] == '-':
        return -hayami[1:]
    return hayami[0] * 10 + hayami[1:]

def hayami_next_double():
    hayami = hayami_saori_next_long()
    if hayami[0] == '-':
        return -hayami[1:]
    return float(hayami[0]) * 10 + float(hayami[1:])

def main():
    hayami = hayami_next_int()
    if hayami < 1000:
        print("ABC")
    else:
        print("ABD")

if __name__ == "__main__":
    main()