x = 100
shift = 2
s = str(x)
if shift > len(s):
    print(s[::-1])
else:
    print(s[len(s) - shift:] + s[:len(s) - shift])