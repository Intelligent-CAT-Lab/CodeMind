lst = ['a', 'c', 'v']
lst.clear()
lst += [1] * (len(lst) + 1)
print(lst)