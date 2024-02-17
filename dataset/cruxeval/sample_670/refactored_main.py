a = ['12','ab']
b = [2,2]
d = dict(zip(a, b))
a.sort(key=d.get, reverse=True)
print([d.pop(x) for x in a])