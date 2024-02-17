def f(strand, zmnc):
    poz = strand.find(zmnc)
    while poz != -1:
        strand = strand[poz + 1:]
        poz = strand.find(zmnc)
    return strand.rfind(zmnc)