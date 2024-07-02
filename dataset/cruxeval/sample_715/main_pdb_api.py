def f(text, char):
    return text.count(char) % 2 != 0
f('abababac', 'a')