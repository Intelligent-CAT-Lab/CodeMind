def f(text):
    for c in text:
        if c.isdigit():
            if c == '0':
                c = '.'
            else:
                c = '0' if c != '1' else '.'
    return ''.join(list(text)).replace('.', '0')
f('697 this is the ultimate 7 address to attack')