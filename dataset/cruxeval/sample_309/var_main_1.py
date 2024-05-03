def f(text, suffix):
    text += suffix	## text = CLRJ | suffix = CLRJ
    while text[-len(suffix):] == suffix:	## text = CLRJ | suffix = CLRJ
        text = text[:-1]	## text = CLRJ
    return text	## text = CLRJ
