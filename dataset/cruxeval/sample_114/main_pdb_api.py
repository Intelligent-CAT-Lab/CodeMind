def f(text, sep):
    return text.rsplit(sep, maxsplit=2)
f("a-.-.b", "-.")