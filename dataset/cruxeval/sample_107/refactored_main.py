text = "ua6hajq"
result = []
for i in range(len(text)):
    if not text[i].isascii():
        print(False)
    elif text[i].isalnum():
        result.append(text[i].upper())
    else:
        result.append(text[i])
print(''.join(result))