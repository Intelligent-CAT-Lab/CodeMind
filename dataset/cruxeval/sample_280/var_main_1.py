field = 0

def f(text):
    global g, field
    field = text.replace(' ', '')	## text = CLRJ
    g = text.replace('0', ' ')	## text = CLRJ
    text = text.replace('1', 'i')	## text = CLRJ

    return text	## text = CLRJ
