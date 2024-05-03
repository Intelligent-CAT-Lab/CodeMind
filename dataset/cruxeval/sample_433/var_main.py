def f(text):
    text = text.split(',')	## {"text" : ''}
    text.pop(0)	## {"text" : ''}
    text.insert(0, text.pop(text.index('T')))	## {"text" : ''}
    return 'T' + ',' + ','.join(text)	## {"text" : ''}
