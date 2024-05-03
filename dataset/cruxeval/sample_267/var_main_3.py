def f(text, space):
    if space < 0:	## <state>space = CLRJ</state>
        return text	## <state>text = CLRJ</state>
    return text.ljust(len(text) // 2 + space)