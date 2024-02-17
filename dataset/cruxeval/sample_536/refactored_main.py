cat = 'C24Bxxx982ab'
digits = 0
for char in cat:
    if char.isdigit():
        digits += 1
print(digits)