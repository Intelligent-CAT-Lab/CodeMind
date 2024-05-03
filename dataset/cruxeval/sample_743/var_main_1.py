def f(text):
    string_a, string_b = text.split(',')	## string_a = CLRJ | string_b = CLRJ | text = CLRJ
    return -(len(string_a) + (len(string_b)))	## string_a = CLRJ | string_b = CLRJ
