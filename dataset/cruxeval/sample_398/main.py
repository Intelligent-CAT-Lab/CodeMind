def f(counts):
    dict = {}
    for k, v in counts.items():
        count = counts[k]
        if count not in dict:
            dict[count] = []
        dict[count].append(k)
    counts.update(dict)
    return counts