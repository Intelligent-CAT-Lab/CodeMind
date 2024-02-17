text = '--4yrw 251-//4 6p'
chars = []
for c in text:
    if c.isdigit():
        chars.append(c)
print(''.join(chars[::-1]))