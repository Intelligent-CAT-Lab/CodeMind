lst = [1, 2, 3, 4, 5]
lst = sorted(set(lst))
print(None if len(lst) < 2 else lst[1])