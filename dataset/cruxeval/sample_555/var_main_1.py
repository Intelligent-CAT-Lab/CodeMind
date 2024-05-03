def f(text, tabstop):
    text = text.replace('\n', '_____')	## text = CLRJ
    text = text.replace('\t', tabstop * ' ')	## text = CLRJ | tabstop = CLRJ
    text = text.replace('_____', '\n')	## text = CLRJ
    return text	## text = CLRJ
