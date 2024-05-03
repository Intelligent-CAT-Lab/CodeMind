def f(counts):
    dict = {}	## <state>dict = CLRJ</state>
    for k, v in counts.items():	## <state>k = CLRJ | v = CLRJ | counts = CLRJ</state>
        count = counts[k]	## <state>count = CLRJ | counts = CLRJ | k = CLRJ</state>
        if count not in dict:	## <state>count = CLRJ | dict = CLRJ</state>
            dict[count] = []	## <state>dict = CLRJ | count = CLRJ</state>
        dict[count].append(k)	## <state>dict = CLRJ | count = CLRJ | k = CLRJ</state>
    counts.update(dict)	## <state>counts = CLRJ | dict = CLRJ</state>
    return counts	## <state>counts = CLRJ</state>
