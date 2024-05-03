def f(text, char):
    position = len(text)	## position = CLRJ | text = CLRJ
    if char in text:	## char = CLRJ | text = CLRJ
        position = text.index(char)	## position = CLRJ | text = CLRJ | char = CLRJ
        if position > 1:	## position = CLRJ
            position = (position + 1) % len(text)
    return position	## position = CLRJ
