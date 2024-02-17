text = 'dEXE'
s = text.lower()
for i in range(len(s)):
    if s[i] == 'x':
        print('no')
        break
else:
    print(text.isupper())