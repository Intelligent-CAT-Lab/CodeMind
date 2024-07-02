def f(text):
    return ''.join(list(text)).isspace()
f(' \t  \u3000')