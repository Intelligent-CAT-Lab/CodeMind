dict = {-1: -1, 5: 5, 3: 6, -4: -4}
result = dict.copy()
remove_keys = []
for k, v in dict.items():
    if v in dict:
        del result[k]
print(result)