def f(text, char):
    count = text.count(char*2)	## count = CLRJ | text = CLRJ | char = CLRJ
    return text[count:]	## text = CLRJ | count = CLRJ
