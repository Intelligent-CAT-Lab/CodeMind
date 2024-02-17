text = ';,,,?'
count = text.count(text[0])
ls = list(text)
for _ in range(count):
    ls.remove(ls[0])
print(''.join(ls))