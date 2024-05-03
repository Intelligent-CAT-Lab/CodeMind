def f(text, pref):
    if isinstance(pref, list):	## <state>pref = CLRJ</state>
        return ', '.join(text.startswith(x) for x in pref)
    else:
        return text.startswith(pref)	## <state>text = CLRJ | pref = CLRJ</state>
