def f(text):
    length = len(text) // 2	## length = CLRJ | text = CLRJ
    left_half = text[:length]	## left_half = CLRJ | text = CLRJ | length = CLRJ
    right_half = text[length:][::-1]	## right_half = CLRJ | text = CLRJ | length = CLRJ
    return left_half + right_half	## left_half = CLRJ | right_half = CLRJ
