def f(text, prefix):
    if text.startswith(prefix):	## <state>text = CLRJ | prefix = CLRJ</state>
        text = text.removeprefix(prefix)
    text = text.capitalize()	## <state>text = CLRJ</state>
    return text	## <state>text = CLRJ</state>
