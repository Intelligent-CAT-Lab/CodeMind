d = {2: 0.76, 5: [3, 6, 9, 12]}
result = {}
for k, v in d.items():
    if isinstance(k, float):
        for i in v:
            result[i] = k
    else:
        result[k] = v
print(result)