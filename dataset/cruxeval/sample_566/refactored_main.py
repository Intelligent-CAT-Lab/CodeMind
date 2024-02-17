string = "towaru"
code = "UTF-8"

t = ''
try:
    t = string.encode(code)
    if t.endswith(b'\n'):
        t = t[:-1]
    t = t.decode('UTF-8')
    print(t)
except:
    print(t)