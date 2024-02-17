my_dict = {'a': 1, 'b': 2, 'c': 3, 'd': 2}
result = {v: k for k, v in my_dict.items()}
print(result)