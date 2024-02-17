text = 'tflb omn rtt'
chars = 'm'
listchars = list(chars)
first = listchars.pop()
for i in listchars:
    text = text[0:text.find(i)]+i+text[text.find(i)+1:]
print(text)