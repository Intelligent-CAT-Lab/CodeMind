def f(text, res):
    for c in '*\n"':
        text = text.replace(c, '!' + str(res))
    if text.startswith('!'):
        text = text[len(str(res)):]
    return text
f('"Leap and the net will appear', 123)