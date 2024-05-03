def f(text, suffix):
    output = text	## <state>output = CLRJ | text = CLRJ</state>
    while text.endswith(suffix):	## <state>text = CLRJ | suffix = CLRJ</state>
        output = text[:-len(suffix)]
        text = output
    return output	## <state>output = CLRJ</state>
