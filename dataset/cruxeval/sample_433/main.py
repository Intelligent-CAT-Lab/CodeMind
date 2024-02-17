def f(text):
    text = text.split(',')
    text.pop(0)
    text.insert(0, text.pop(text.index('T')))
    return 'T' + ',' + ','.join(text)