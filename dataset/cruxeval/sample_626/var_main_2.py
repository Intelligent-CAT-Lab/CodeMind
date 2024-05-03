def f(line, equalityMap):
    rs = {	## rs = []
        k[0]: k[1] for k in equalityMap	## k = [] | equalityMap = []
    }
    return line.translate(str.maketrans(rs))	## line = [] | rs = []
