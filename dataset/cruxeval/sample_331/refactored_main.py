strand = ''
zmnc = 'abc'
poz = strand.find(zmnc)
while poz != -1:
    strand = strand[poz + 1:]
    poz = strand.find(zmnc)
print(strand.rfind(zmnc))