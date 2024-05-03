def f(text, suffix):
    if suffix and suffix[-1] in text:	## <state>suffix = CLRJ | text = CLRJ</state>
        return f(text.rstrip(suffix[-1]), suffix[:-1])	## <state>text = CLRJ | suffix = CLRJ</state>
    else:
        return text	## <state>text = CLRJ</state>
