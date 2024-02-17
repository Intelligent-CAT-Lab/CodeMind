text = "lorem ipsum"
for space in text:
    if space == ' ':
        text = text.lstrip()
    else:
        text = text.replace('cd', space)
print(text)