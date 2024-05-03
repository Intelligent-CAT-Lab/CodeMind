def f(text, suffix):
    text += suffix	## <state>text = CLRJ | suffix = CLRJ</state>
    while text[-len(suffix):] == suffix:	## <state>text = CLRJ | suffix = CLRJ</state>
        text = text[:-1]	## <state>text = CLRJ</state>
    return text	## <state>text = CLRJ</state>
