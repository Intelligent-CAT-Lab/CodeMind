def f(text, char):
    count = text.count(char*2)
    return text[count:]
f('vzzv2sg', 'z')