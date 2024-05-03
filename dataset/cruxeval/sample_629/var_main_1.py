def f(text, dng):
    if dng not in text:	## dng = CLRJ | text = CLRJ
        return text
    if text[-len(dng):] == dng:	## text = CLRJ | dng = CLRJ
        return text[:-len(dng)]	## text = CLRJ | dng = CLRJ
    return text[:-1] + f(text[:-2], dng)