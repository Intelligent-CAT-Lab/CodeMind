def f(line, equalityMap):
    rs = {	## <state>rs = CLRJ</state>
        k[0]: k[1] for k in equalityMap	## <state>k = CLRJ | equalityMap = CLRJ</state>
    }
    return line.translate(str.maketrans(rs))	## <state>line = CLRJ | rs = CLRJ</state>
