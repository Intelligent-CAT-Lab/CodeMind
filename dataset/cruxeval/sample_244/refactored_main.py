text = ''
symbols = 'BC1ty'
count = 0
if symbols:
    for i in symbols:
        count += 1
    text = text * count
print(text.rjust(len(text) + count*2)[:-2])