field = 0

def f(text):
    global g, field
    field = text.replace(' ', '')
    g = text.replace('0', ' ')
    text = text.replace('1', 'i')

    return text