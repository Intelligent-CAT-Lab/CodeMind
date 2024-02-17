text = 'scedvtvotkwqfoqn'
value = 'o'
indexes = list()
for i in range(len(text)):
    if text[i] == value:
        indexes.append(i)
new_text = list(text)
for i in indexes:
    new_text.remove(value)
print(''.join(new_text))