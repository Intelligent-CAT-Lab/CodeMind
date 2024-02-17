dictionary = {'Iron Man': 4, 'Captain America': 3, 'Black Panther': 0, 'Thor': 1, 'Ant-Man': 6}
key = 'Iron Man'
del dictionary[key]
if min(dictionary) == key:
    key = list(dictionary)[0]
print(key)