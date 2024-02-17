line = "\"\\%$ normal chars $%~ qwet42'"
a = []
for c in line:
    if c.isalnum():
        a.append(c)
print(''.join(a))