l1 = ['a', 'b']
l2 = ['car', 'dog']
if len(l1) != len(l2):
    print({})
else:
    print(dict.fromkeys(l1, l2))