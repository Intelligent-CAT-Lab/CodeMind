def f(text, pref):
    length = len(pref)	## <state>length = CLRJ | pref = CLRJ</state>
    if pref == text[:length]:	## <state>pref = CLRJ | text = CLRJ | length = CLRJ</state>
        return text[length:]	## <state>text = CLRJ | length = CLRJ</state>
    return text