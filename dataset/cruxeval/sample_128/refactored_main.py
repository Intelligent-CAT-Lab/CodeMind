text = 'Mammoth'
odd = ''
even = ''
for i, c in enumerate(text):
    if i % 2 == 0:
        even += c
    else:
        odd += c
print(even + odd.lower())