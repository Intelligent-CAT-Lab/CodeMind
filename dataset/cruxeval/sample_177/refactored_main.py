text = 'Hey DUdE THis $nd^ &*&this@#'
text = list(text)
for i in range(len(text)):
    if i % 2 == 1:
        text[i] = text[i].swapcase()
print(''.join(text))