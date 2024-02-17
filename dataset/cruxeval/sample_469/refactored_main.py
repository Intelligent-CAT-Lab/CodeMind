text = 'sduyai'
position = 1
value = 'y'
length = len(text)
index = position % (length)
if position < 0:
    index = length // 2
new_text = list(text)
new_text.insert(index, value)
new_text.pop(length-1)
print(''.join(new_text))