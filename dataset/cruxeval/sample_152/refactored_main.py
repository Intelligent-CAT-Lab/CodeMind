text = ''.join(['A'] * 20)
n = 0
for char in text:
    if char.isupper():
        n += 1
print(n)