def f(text, char):
    return ' '.join(text.split(char, len(text)))
f('a', 'a')