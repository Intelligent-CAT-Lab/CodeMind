text = 'Thisisastring'
number = 0
for t in text:
    if t.isnumeric():
        number += 1
print(number)