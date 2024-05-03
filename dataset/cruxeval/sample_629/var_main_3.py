def f(text, dng):
    if dng not in text:	## <state>dng = CLRJ | text = CLRJ</state>
        return text
    if text[-len(dng):] == dng:	## <state>text = CLRJ | dng = CLRJ</state>
        return text[:-len(dng)]	## <state>text = CLRJ | dng = CLRJ</state>
    return text[:-1] + f(text[:-2], dng)