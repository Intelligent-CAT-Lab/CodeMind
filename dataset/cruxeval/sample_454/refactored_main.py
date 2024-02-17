d = {'a': 2, 'b': [], 'c': {}}
count = 0
new_dict = {}
for _ in range(count):
    d = d.copy()
    new_dict = {**d, **new_dict}
print(new_dict)