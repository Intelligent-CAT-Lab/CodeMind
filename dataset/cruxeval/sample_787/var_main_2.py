def f(text):
    if len(text) == 0:	## text = []
        return ''
    text = text.lower()	## text = []
    return text[0].upper() + text[1:]	## text = []
