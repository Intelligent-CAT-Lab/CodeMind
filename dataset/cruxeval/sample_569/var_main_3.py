def f(txt):
    coincidences = {}	## <state>coincidences = CLRJ</state>
    for c in txt:	## <state>c = CLRJ | txt = CLRJ</state>
        if c in coincidences:	## <state>c = CLRJ | coincidences = CLRJ</state>
            coincidences[c] += 1	## <state>coincidences = CLRJ | c = CLRJ</state>
        else:
            coincidences[c] = 1	## <state>coincidences = CLRJ | c = CLRJ</state>
    return sum(coincidences.values())	## <state>coincidences = CLRJ</state>
