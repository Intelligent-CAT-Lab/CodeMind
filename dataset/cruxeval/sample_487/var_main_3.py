def f(dict):
    even_keys = []	## <state>even_keys = CLRJ</state>
    for key in dict.keys():	## <state>key = CLRJ | dict = CLRJ</state>
        if key % 2 == 0:	## <state>key = CLRJ</state>
            even_keys.append(key)	## <state>even_keys = CLRJ | key = CLRJ</state>
    return even_keys	## <state>even_keys = CLRJ</state>
