def f(text):
    for space in text:	## space = CLRJ | text = CLRJ
        if space == ' ':	## space = CLRJ
            text = text.lstrip()	## text = CLRJ
        else:
            text = text.replace('cd', space)	## text = CLRJ | space = CLRJ
    return text	## text = CLRJ
