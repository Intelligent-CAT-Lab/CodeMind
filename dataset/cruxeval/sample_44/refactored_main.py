text = 'nzoh'
ls = list(text)
for i in range(0, len(ls)):
    if ls[i]!='+':
        ls.insert(i, '+')
        ls.insert(i, '*')
        break
print('+'.join(ls))