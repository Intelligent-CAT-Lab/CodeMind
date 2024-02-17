text = 'undbs l'
position = 1
length = len(text)
index = position % (length + 1)
if position < 0 or index < 0:
    index = -1
new_text = list(text)
new_text.pop(index)
print(''.join(new_text))