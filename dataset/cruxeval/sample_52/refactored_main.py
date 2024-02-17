text = "seiq7229 d27"
a = []
for i in range(len(text)):
    if not text[i].isdecimal():
        a.append(text[i])
print(''.join(a))