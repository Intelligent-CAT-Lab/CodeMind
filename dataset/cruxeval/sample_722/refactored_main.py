text = ',wPzPppdl/'
out = ""
for i in range(len(text)):
    if text[i].isupper():
        out += text[i].lower()
    else:
        out += text[i].upper()
print(out)