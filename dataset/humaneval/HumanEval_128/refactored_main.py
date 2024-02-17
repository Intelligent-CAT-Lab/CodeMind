arr = [1, 2, 2, -4]
if not arr: print(None)
prod = 0 if 0 in arr else (-1) ** len(list(filter(lambda x: x < 0, arr)))
print(prod * sum([abs(i) for i in arr]))