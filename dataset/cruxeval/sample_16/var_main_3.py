def f(text, suffix):
    if text.endswith(suffix):	## <state>text = CLRJ | suffix = CLRJ</state>
        return text[:-len(suffix)]
    return text	## <state>text = CLRJ</state>
