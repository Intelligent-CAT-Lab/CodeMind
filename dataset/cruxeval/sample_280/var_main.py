field = 0

def f(text):
    global g, field
    field = text.replace(' ', '')	## {"text" : ''}
    g = text.replace('0', ' ')	## {"text" : ''}
    text = text.replace('1', 'i')	## {"text" : ''}

    return text	## {"text" : ''}
