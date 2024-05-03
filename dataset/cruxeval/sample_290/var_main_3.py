def f(text, prefix):
    if text.startswith(prefix):	## <state>text = CLRJ | prefix = CLRJ</state>
        return text.removeprefix(prefix)
    if prefix in text:	## <state>prefix = CLRJ | text = CLRJ</state>
        return text.replace(prefix, '').strip()
    return text.upper()	## <state>text = CLRJ</state>
