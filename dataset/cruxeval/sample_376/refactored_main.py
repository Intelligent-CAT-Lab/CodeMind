text = "2two programmers"
for i in range(len(text)):
    if text[0:i].startswith("two"):
        result = text[i:]
        break
    else:
        result = 'no'
print(result)