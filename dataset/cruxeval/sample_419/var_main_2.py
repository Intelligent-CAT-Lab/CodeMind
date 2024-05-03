def f(text, value):
    if not value in text:	## value = [] | text = []
        return ''
    return text.rpartition(value)[0]	## text = [] | value = []
