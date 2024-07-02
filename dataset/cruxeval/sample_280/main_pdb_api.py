field = 0

def f(text):
    global g, field
    field = text.replace(' ', '')
    g = text.replace('0', ' ')
    text = text.replace('1', 'i')

    return text
f('00000000 00000000 01101100 01100101 01101110')