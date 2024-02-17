text = 'no asw'
fill = 'j'
size = 1
if size < 0:
    size = -size
if len(text) > size:
    print(text[len(text) - size:])
else:
    print(text.rjust(size, fill))