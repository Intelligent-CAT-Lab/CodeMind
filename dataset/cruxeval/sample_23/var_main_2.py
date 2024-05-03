def f(text, chars):
    if chars:	## chars = []
        text = text.rstrip(chars)	## text = [] | chars = []
    else:
        text = text.rstrip(' ')
    if text == '':	## text = []
        return '-'
    return text	## text = []
