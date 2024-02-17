lst = [4, 88]
print(sum([lst[i] for i in range(1, len(lst), 2) if lst[i]%2 == 0]))