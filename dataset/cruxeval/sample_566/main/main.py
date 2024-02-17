def f(string, code):
    t = ''
    try:
        t = string.encode(code)
        if t.endswith(b'\n'):
            t = t[:-1]
        t = t.decode('UTF-8')
        return t
    except:
        return t