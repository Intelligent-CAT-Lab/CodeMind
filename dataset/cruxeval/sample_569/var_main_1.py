def f(txt):
    coincidences = {}	## coincidences = CLRJ
    for c in txt:	## c = CLRJ | txt = CLRJ
        if c in coincidences:	## c = CLRJ | coincidences = CLRJ
            coincidences[c] += 1	## coincidences = CLRJ | c = CLRJ
        else:
            coincidences[c] = 1	## coincidences = CLRJ | c = CLRJ
    return sum(coincidences.values())	## coincidences = CLRJ
