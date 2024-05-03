def f(original, string):
    temp = dict(original)	## <state>temp = CLRJ | original = CLRJ</state>
    for a, b in string.items():	## <state>a = CLRJ | b = CLRJ | string = CLRJ</state>
        temp[b] = a	## <state>temp = CLRJ | b = CLRJ | a = CLRJ</state>
    return temp	## <state>temp = CLRJ</state>
