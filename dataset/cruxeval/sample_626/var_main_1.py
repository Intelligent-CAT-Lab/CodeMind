def f(line, equalityMap):
    rs = {	## rs = CLRJ
        k[0]: k[1] for k in equalityMap	## k = CLRJ | equalityMap = CLRJ
    }
    return line.translate(str.maketrans(rs))	## line = CLRJ | rs = CLRJ
