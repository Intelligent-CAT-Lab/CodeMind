def f(text, chars):
    if chars:	## <state>chars = CLRJ</state>
        text = text.rstrip(chars)	## <state>text = CLRJ | chars = CLRJ</state>
    else:
        text = text.rstrip(' ')
    if text == '':	## <state>text = CLRJ</state>
        return '-'
    return text	## <state>text = CLRJ</state>
