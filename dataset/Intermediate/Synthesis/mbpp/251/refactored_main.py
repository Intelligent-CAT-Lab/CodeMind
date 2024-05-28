list = ['Red', 'Green', 'Black']
element = 'c'
list = [v for elt in list for v in (element, elt)]
print(list)