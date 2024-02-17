dict = { 4: 'a' }
even_keys = []
for key in dict.keys():
    if key % 2 == 0:
        even_keys.append(key)
print(even_keys)