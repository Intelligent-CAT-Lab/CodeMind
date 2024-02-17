values = ['0','3']
value = 117
length = len(values)
new_dict = dict.fromkeys(values, value)
new_dict[''.join(sorted(values))] = value * 3
print(new_dict)