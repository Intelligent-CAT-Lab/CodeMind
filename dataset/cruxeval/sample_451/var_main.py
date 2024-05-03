def f(text, char):
    text = list(text)	## {"text" : ''}
    for count, item in enumerate(text):	## {"count" : '',"item" : '',"text" : ''}
        if item == char:	## {"item" : '',"char" : ''}
            text.remove(item)	## {"text" : '',"item" : ''}
            return ''.join(text)	## {"text" : ''}
    return text