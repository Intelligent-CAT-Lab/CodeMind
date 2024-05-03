def f(text):
    text = text.split(' ')	## <state>text = CLRJ</state>
    for t in text:	## <state>t = CLRJ | text = CLRJ</state>
        if not t.isnumeric():	## <state>t = CLRJ</state>
            return 'no'
    return 'yes'