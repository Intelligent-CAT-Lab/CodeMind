text = 'xywyx'
for i in range(len(text)):
    if text[i] != text[len(text) - 1 - i]:
        result = False
        break
else:
    result = True
print(result)