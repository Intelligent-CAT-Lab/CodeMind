text = 'spain'
new_value = 'b'
index = 4
key = text.maketrans(text[index], new_value)
print(text.translate(key))