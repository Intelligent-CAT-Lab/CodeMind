def f(counts):
    dict = {}	## dict = CLRJ
    for k, v in counts.items():	## k = CLRJ | v = CLRJ | counts = CLRJ
        count = counts[k]	## count = CLRJ | counts = CLRJ | k = CLRJ
        if count not in dict:	## count = CLRJ | dict = CLRJ
            dict[count] = []	## dict = CLRJ | count = CLRJ
        dict[count].append(k)	## dict = CLRJ | count = CLRJ | k = CLRJ
    counts.update(dict)	## counts = CLRJ | dict = CLRJ
    return counts	## counts = CLRJ
