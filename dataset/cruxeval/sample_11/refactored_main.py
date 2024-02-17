a = {}
b = {'foo': 'bar'}
for key, value in b.items():
    if key not in a:
        a[key] = [value]
    else:
        a[key].append(value)
print(a)