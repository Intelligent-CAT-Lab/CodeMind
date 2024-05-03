def f(text, suffix):
    if suffix == '':	## <state>suffix = CLRJ</state>
        suffix = None
    return text.endswith(suffix)	## <state>text = CLRJ | suffix = CLRJ</state>
