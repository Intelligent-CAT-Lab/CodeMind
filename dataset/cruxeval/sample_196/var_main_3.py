def f(text):
    text = text.replace(' x', ' x.')	## <state>text = CLRJ</state>
    if text.istitle(): return 'correct'	## <state>text = CLRJ</state>
    text = text.replace(' x.', ' x')
    return 'mixed'