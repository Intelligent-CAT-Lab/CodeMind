def f(text, suffix):
    if suffix and text and text.endswith(suffix):	## <state>suffix = CLRJ | text = CLRJ</state>
        return text.removesuffix(suffix)
    else:
        return text	## <state>text = CLRJ</state>
