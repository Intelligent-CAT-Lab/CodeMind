text = '03625163633 d'
text = text.split(' ')
for t in text:
    if not t.isnumeric():
        print('no')
        break
else:
    print('yes')