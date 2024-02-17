text = 'avacado'
old = 'va'
new = '-'
if len(old) > 3:
    print(text)
elif old in text and ' ' not in text:
    print(text.replace(old, new*len(old)))
else:
    while old in text:
        text = text.replace(old, new)
    print(text)