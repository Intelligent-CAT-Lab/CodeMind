text = 'pn'
char = 'p'
text = list(text)
for count, item in enumerate(text):
    if item == char:
        text.remove(item)
        return ''.join(text)
print(text)