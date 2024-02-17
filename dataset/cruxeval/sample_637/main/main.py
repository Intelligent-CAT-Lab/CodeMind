def f(text):
    text = text.split(' ')
    for t in text:
        if not t.isnumeric():
            return 'no'
    return 'yes'