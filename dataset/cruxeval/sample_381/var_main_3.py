def f(text, num_digits):
    width = max(1, num_digits)	## <state>width = CLRJ | num_digits = CLRJ</state>
    return text.zfill(width)	## <state>text = CLRJ | width = CLRJ</state>
