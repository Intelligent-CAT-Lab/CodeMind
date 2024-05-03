def f(text, value):
    left, _, right = text.partition(value)	## left = CLRJ | _ = CLRJ | right = CLRJ | text = CLRJ | value = CLRJ
    return right + left	## right = CLRJ | left = CLRJ
