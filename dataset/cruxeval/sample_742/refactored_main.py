text = "-1-3"
b = True
for x in text:
    if x.isdigit():
        b = True
    else:
        b = False
        break
print(b)