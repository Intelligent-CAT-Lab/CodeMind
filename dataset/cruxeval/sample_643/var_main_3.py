def f(text, suffix):
    if text.endswith(suffix):	## <state>text = CLRJ | suffix = CLRJ</state>
        text = text[:-1] + text[-1:].swapcase()	## <state>text = CLRJ</state>
    return text	## <state>text = CLRJ</state>
