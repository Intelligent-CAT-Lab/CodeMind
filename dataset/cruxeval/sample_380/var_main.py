def f(text, delimiter):
    text = text.rpartition(delimiter)	## {"text" : '',"delimiter" : ''}
    return text[0] + text[-1]	## {"text" : ''}
