def f(txt, marker):
    a = []
    lines = txt.split('\n')
    for line in lines:
        a.append(line.center(marker))
    return '\n'.join(a)