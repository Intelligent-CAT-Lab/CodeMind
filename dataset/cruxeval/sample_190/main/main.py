def f(text):
    short = ''
    for c in text:
        if(c.islower()):
            short += c
    return short