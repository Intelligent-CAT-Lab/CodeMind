def f(dct):
    lst = []	## <state>lst = CLRJ</state>
    for key in sorted(dct):	## <state>key = CLRJ | dct = CLRJ</state>
        lst.append((key, dct[key]))	## <state>lst = CLRJ | key = CLRJ | dct = CLRJ</state>
    return lst	## <state>lst = CLRJ</state>
