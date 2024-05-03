def f(text):
    if len(text) == 0:	## <state>text = CLRJ</state>
        return ''
    text = text.lower()	## <state>text = CLRJ</state>
    return text[0].upper() + text[1:]	## <state>text = CLRJ</state>
