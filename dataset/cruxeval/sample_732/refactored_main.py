char_freq = {'u': 20, 'v': 5, 'b': 7, 'w': 3, 'x': 3}
result = {}
for k, v in char_freq.copy().items():
    result[k] = v // 2
print(result)