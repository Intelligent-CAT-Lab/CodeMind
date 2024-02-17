names = ['e', 'f', 'j', 'x', 'r', 'k']
winners = ['a', 'v', '2', 'im', 'nb', 'vj', 'z']
ls = [names.index(name) for name in names if name in winners]
ls.sort(reverse=True)
print(ls)