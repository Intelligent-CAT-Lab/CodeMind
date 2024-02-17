text = 'jao mt'
value = 'house'
length = len(text)
index = 0
while length > 0:
    value = text[index] + value
    length -= 1
    index += 1
print(value)