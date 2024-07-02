def f(cat):
    digits = 0
    for char in cat:
        if char.isdigit():
            digits += 1
    return digits
f('C24Bxxx982ab')