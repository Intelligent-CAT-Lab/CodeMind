def f(text):
    if not text.istitle():	## <state>text = CLRJ</state>
        return text.title()	## <state>text = CLRJ</state>
    return text.lower()