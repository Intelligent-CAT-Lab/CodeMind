x = ""
y = "sdasdnakjsda80"
tmp = ''.join(['0' if c == '9' else '9' for c in y[::-1]])
if (x.isnumeric() and tmp.isnumeric()):
    print(x + tmp)
else:
    print(x)