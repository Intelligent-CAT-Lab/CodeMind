def f(text, value):
    left, _, right = text.partition(value)	## <state>left = CLRJ | _ = CLRJ | right = CLRJ | text = CLRJ | value = CLRJ</state>
    return right + left	## <state>right = CLRJ | left = CLRJ</state>
