def f(text, tabstop):
    text = text.replace('\n', '_____')	## text = []
    text = text.replace('\t', tabstop * ' ')	## text = [] | tabstop = []
    text = text.replace('_____', '\n')	## text = []
    return text	## text = []
