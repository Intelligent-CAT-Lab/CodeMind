def f(text, prefix):
    while text.startswith(prefix):	## <state>text = CLRJ | prefix = CLRJ</state>
        text = text[len(prefix):] or text	## <state>text = CLRJ | prefix = CLRJ</state>
    return text	## <state>text = CLRJ</state>
