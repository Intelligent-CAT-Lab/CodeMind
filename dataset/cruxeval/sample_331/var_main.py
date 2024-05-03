def f(strand, zmnc):
    poz = strand.find(zmnc)	## {"poz" : '',"strand" : '',"zmnc" : ''}
    while poz != -1:	## {"poz" : ''}
        strand = strand[poz + 1:]
        poz = strand.find(zmnc)
    return strand.rfind(zmnc)	## {"strand" : '',"zmnc" : ''}
