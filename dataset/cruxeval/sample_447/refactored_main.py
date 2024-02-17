text = "\ta"
tab_size = 3
res = ''
text = text.replace('\t', ' '*(tab_size-1))
for i in range(len(text)):
    if text[i] == ' ':
        res += '|'
    else:
        res += text[i]
print(res)