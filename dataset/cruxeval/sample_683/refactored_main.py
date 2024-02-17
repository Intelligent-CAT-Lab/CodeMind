dict1 = {'disface': 9, 'cam': 7}
dict2 = {'mforce': 5}

result = dict1.copy()
result.update([(__, dict2[__]) for __ in dict2])
print(result)