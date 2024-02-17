n = 'xqc'
s = 'mRcwVqXsRDRb'
if s.startswith(n):
    pre, _ = s.split(n, 1)
    print(pre + n + s[len(n):])
else:
    print(s)