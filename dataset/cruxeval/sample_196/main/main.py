def f(text):
    text = text.replace(' x', ' x.')
    if text.istitle(): return 'correct'
    text = text.replace(' x.', ' x')
    return 'mixed'