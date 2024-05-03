def f(text, prefix):
    idx = 0	## <state>idx = CLRJ</state>
    for letter in prefix:	## <state>letter = CLRJ | prefix = CLRJ</state>
        if text[idx] != letter:	## <state>text = CLRJ | idx = CLRJ | letter = CLRJ</state>
            return None
        idx += 1	## <state>idx = CLRJ</state>
    return text[idx:]	## <state>text = CLRJ | idx = CLRJ</state>
