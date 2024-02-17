text = 'USaR'
index = 1
while index < len(text):
    if text[index] != text[index - 1]:
        index += 1
    else:
        text1 = text[:index]
        text2 = text[index:].swapcase()
        print(text1 + text2)
        break
else:
    print(text.swapcase())