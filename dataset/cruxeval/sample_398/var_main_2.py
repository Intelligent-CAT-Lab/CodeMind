def f(counts):
    dict = {}	## dict = []
    for k, v in counts.items():	## k = [] | v = [] | counts = []
        count = counts[k]	## count = [] | counts = [] | k = []
        if count not in dict:	## count = [] | dict = []
            dict[count] = []	## dict = [] | count = []
        dict[count].append(k)	## dict = [] | count = [] | k = []
    counts.update(dict)	## counts = [] | dict = []
    return counts	## counts = []
