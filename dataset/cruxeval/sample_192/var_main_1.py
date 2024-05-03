def f(text, suffix):
    output = text	## output = CLRJ | text = CLRJ
    while text.endswith(suffix):	## text = CLRJ | suffix = CLRJ
        output = text[:-len(suffix)]
        text = output
    return output	## output = CLRJ
