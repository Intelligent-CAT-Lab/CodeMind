arr = [1,-2,-3,41,57,76,87,88,99]
k = 3
print(sum(elem for elem in arr[:k] if len(str(elem)) <= 2))