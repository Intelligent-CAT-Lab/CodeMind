string = '[ Hello ]+ Hello, World!!_ Hi'
tmp = string.lower()
for char in string.lower():
    if char in tmp:
        tmp = tmp.replace(char, '', 1)
print(tmp)