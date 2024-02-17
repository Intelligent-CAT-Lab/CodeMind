text = "r;r;r;r;r;r;r;r;r"
characters = "x.r"
for i in range(len(characters)):
    text = text.rstrip(characters[i::len(characters)])
print(text)