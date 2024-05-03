def f(text):
    if text.isalnum() and all(i.isdigit() for i in text):	## <state>text = CLRJ</state>
        return 'integer'
    return 'string'