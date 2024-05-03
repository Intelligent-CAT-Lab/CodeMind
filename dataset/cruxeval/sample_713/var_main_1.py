def f(text, char):
    if char in text:	## char = CLRJ | text = CLRJ
        text = [t.strip() for t in text.split(char) if t]	## text = CLRJ | t = CLRJ | char = CLRJ
        if len(text) > 1:	## text = CLRJ
            return True
    return False