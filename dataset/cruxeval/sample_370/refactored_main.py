text = '     i'
for char in text:
    if not char.isspace():
        print(False)
        break
else:
    print(True)