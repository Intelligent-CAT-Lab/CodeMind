def f(text, suffix):
    if suffix and text.endswith(suffix):	## <state>suffix = CLRJ | text = CLRJ</state>
        return text[:- len(suffix)]
    return text	## <state>text = CLRJ</state>
