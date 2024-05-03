def f(prefix, text):
    if text.startswith(prefix):	## <state>text = CLRJ | prefix = CLRJ</state>
        return text
    else:
        return prefix + text	## <state>prefix = CLRJ | text = CLRJ</state>
