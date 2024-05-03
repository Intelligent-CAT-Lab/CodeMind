def f(text):
    if text.isidentifier():	## <state>text = CLRJ</state>
        return ''.join(c for c in text if c.isdigit())
    else:
        return ''.join(text)	## <state>text = CLRJ</state>
