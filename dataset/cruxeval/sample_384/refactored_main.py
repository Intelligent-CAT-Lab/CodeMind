text = 'asfdellos'
chars = 'Ta'
chars = list(chars)
text = list(text)
new_text = text
while len(new_text) > 0 and text:
    if new_text[0] in chars:
        new_text = new_text[1:]
    else:
        break 
print(''.join(new_text))