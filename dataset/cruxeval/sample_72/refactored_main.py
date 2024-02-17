text = '99'
for c in text:
    if not c.isnumeric():
        print(False)
        break
print(bool(text))