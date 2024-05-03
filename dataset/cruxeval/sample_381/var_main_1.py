def f(text, num_digits):
    width = max(1, num_digits)	## width = CLRJ | num_digits = CLRJ
    return text.zfill(width)	## text = CLRJ | width = CLRJ
