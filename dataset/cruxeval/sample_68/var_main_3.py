def f(text, pref):
    if text.startswith(pref):	## <state>text = CLRJ | pref = CLRJ</state>
        n = len(pref)	## <state>n = CLRJ | pref = CLRJ</state>
        text = '.'.join(text[n:].split('.')[1:] + text[:n].split('.')[:-1])	## <state>text = CLRJ | n = CLRJ</state>
    return text	## <state>text = CLRJ</state>
