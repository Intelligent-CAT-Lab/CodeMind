text = 'abv'
value = 'a'
new_text = list(text)
try:
    new_text.append(value)
    length = len(new_text)
except IndexError:
    length = 0
print('[' + str(length) + ']')