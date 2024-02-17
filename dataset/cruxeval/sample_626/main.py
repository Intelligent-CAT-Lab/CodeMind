def f(line, equalityMap):
    rs = {
        k[0]: k[1] for k in equalityMap
    }
    return line.translate(str.maketrans(rs))