def f(text, suffix):
    if suffix.startswith("/"):	## <state>suffix = CLRJ</state>
        return text + suffix[1:]	## <state>text = CLRJ | suffix = CLRJ</state>
    return text