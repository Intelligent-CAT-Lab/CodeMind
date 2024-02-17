array = []
c = array
array_copy = array

while True:
    c.append('_')
    if c == array_copy:
        array_copy[c.index('_')] = ''
        break

print(array_copy)