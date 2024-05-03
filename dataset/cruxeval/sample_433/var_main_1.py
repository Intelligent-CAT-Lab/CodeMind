def f(text):
    text = text.split(',')	## text = CLRJ
    text.pop(0)	## text = CLRJ
    text.insert(0, text.pop(text.index('T')))	## text = CLRJ
    return 'T' + ',' + ','.join(text)	## text = CLRJ
