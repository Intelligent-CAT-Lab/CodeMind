text = 'w'
space_symbol = '))'
size = 7
spaces = ''.join(space_symbol for i in range(size-len(text)))
print(text + spaces)