text = "1zd"
position = 0
value = 'm'

length = len(text)
index = (position % (length + 2)) - 1
if index >= length or index < 0:
    print(text)
else:
    text[index] = value
    print(''.join(text))