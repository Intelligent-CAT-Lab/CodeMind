def f(strand, zmnc):
    poz = strand.find(zmnc)	## <state>poz = CLRJ | strand = CLRJ | zmnc = CLRJ</state>
    while poz != -1:	## <state>poz = CLRJ</state>
        strand = strand[poz + 1:]
        poz = strand.find(zmnc)
    return strand.rfind(zmnc)	## <state>strand = CLRJ | zmnc = CLRJ</state>
