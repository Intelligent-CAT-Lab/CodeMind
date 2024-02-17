def f(text):
    rtext = list(text)
    for i in range(1, len(rtext) - 1):
        rtext.insert(i + 1, '|')
    return ''.join(rtext)