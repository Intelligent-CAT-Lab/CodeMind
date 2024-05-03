def f(strand, zmnc):
    poz = strand.find(zmnc)	## poz = CLRJ | strand = CLRJ | zmnc = CLRJ
    while poz != -1:	## poz = CLRJ
        strand = strand[poz + 1:]
        poz = strand.find(zmnc)
    return strand.rfind(zmnc)	## strand = CLRJ | zmnc = CLRJ
