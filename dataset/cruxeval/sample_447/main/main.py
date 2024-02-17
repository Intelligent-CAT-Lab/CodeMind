def f(text, tab_size):
    res = ''
    text = text.replace('\t', ' '*(tab_size-1))
    for i in range(len(text)):
        if text[i] == ' ':
            res += '|'
        else:
            res += text[i]
    return res