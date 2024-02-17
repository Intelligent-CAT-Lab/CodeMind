def f(text, tabstop):
    text = text.replace('\n', '_____')
    text = text.replace('\t', tabstop * ' ')
    text = text.replace('_____', '\n')
    return text