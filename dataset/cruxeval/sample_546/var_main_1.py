def f(text, speaker):
    while text.startswith(speaker):	## text = CLRJ | speaker = CLRJ
        text = text[len(speaker):]	## text = CLRJ | speaker = CLRJ
    return text	## text = CLRJ
