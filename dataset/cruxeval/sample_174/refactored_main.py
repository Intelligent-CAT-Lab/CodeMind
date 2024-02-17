lst = [1, 2, 3]
lst[1:4] = lst[1:4][::-1]
print(lst)