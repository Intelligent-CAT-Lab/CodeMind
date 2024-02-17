text = 'ldebgp o'
value = 'o'
length = len(text)
letters = list(text)
if value not in letters:
    value = letters[0]
print(value * length)