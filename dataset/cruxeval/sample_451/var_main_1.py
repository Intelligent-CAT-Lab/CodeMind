def f(text, char):
    text = list(text)	## text = CLRJ
    for count, item in enumerate(text):	## count = CLRJ | item = CLRJ | text = CLRJ
        if item == char:	## item = CLRJ | char = CLRJ
            text.remove(item)	## text = CLRJ | item = CLRJ
            return ''.join(text)	## text = CLRJ
    return text