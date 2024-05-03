def f(text):
    text = text.replace(' x', ' x.')	## {"text" : ''}
    if text.istitle(): return 'correct'	## {"text" : ''}
    text = text.replace(' x.', ' x')
    return 'mixed'