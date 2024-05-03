def f(text):
    for p in ['acs', 'asp', 'scn']:	## <state>p = CLRJ</state>
        text = text.removeprefix(p) + ' '	## <state>text = CLRJ | p = CLRJ</state>
    return text.removeprefix(' ')[:-1]