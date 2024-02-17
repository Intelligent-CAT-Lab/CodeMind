text = 'akoon'
sign = 'sXo'
length = len(text)
new_text = list(text)
sign = list(sign)
for i in range(len(sign)):
    new_text.insert((i * length - 1) // 2 + (i + 1) // 2, sign[i])
print(''.join(new_text))