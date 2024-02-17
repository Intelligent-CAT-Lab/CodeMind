counts = {'2': 2, '0': 1, '1': 2}
dict = {}
for k, v in counts.items():
    count = counts[k]
    if count not in dict:
        dict[count] = []
    dict[count].append(k)
counts.update(dict)
print(counts)