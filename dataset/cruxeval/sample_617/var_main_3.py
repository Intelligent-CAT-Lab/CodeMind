def f(text):
    if text.isascii():	## <state>text = CLRJ</state>
        return 'ascii'
    else:
        return 'non ascii'