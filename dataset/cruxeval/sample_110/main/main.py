def f(text):
    a = ['']
    b = ''
    for i in text:
        if not i.isspace():
            a.append(b)
            b = ''
        else:
            b += i
    return len(a)