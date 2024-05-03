def f(text):
    text = text.replace(' x', ' x.')	## text = CLRJ
    if text.istitle(): return 'correct'	## text = CLRJ
    text = text.replace(' x.', ' x')
    return 'mixed'