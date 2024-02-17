global g, field
text = '00000000 00000000 01101100 01100101 01101110'
field = text.replace(' ', '')
g = text.replace('0', ' ')
text = text.replace('1', 'i')
print(text)