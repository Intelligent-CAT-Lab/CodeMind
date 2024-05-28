dict1 = {'c1': 'Red', 'c2': 'Green', 'c3':None}
dict1 = {key:value for (key, value) in dict1.items() if value is not None}
print(dict1)