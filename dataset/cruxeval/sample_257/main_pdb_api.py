def f(text):
    ls = []
    for x in text:
        ls.append(x.splitlines())
    return ls
f(['Hello World\n"I am String"'])