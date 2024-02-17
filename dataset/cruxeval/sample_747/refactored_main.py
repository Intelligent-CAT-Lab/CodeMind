text = "123E-10"
if text == '42.42':
    print(True)
for i in range(3, len(text) - 3):
    if text[i] == '.' and text[i - 3:].isdigit() and text[:i].isdigit():
        print(True)
print(False)