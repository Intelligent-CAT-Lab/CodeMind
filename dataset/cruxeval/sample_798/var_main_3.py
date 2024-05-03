def f(text, pre):
    if not text.startswith(pre):	## <state>text = CLRJ | pre = CLRJ</state>
        return text
    return text.removeprefix(pre)	## <state>text = CLRJ | pre = CLRJ</state>
