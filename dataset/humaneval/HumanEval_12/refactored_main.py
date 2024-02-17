strings = ['x', 'yyy', 'zzzz', 'www', 'kkkk', 'abc']
if not strings:
    print(None)

maxlen = max(len(x) for x in strings)
for s in strings:
    if len(s) == maxlen:
        print(s)