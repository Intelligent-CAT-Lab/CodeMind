text = '"Leap and the net will appear'
res = 123
for c in '*\n"':
    text = text.replace(c, '!' + str(res))
if text.startswith('!'):
    text = text[len(str(res)):]
print(text)