def f(text, fill, size):
    if size < 0:	## {"size" : ''}
        size = -size
    if len(text) > size:	## {"text" : '',"size" : ''}
        return text[len(text) - size:]	## {"text" : '',"size" : ''}
    return text.rjust(size, fill)