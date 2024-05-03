def f(text, value):
    if not value in text:	## <state>value = CLRJ | text = CLRJ</state>
        return ''
    return text.rpartition(value)[0]	## <state>text = CLRJ | value = CLRJ</state>
