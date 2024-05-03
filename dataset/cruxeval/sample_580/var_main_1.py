def f(text, char):
    new_text = text	## new_text = CLRJ | text = CLRJ
    a = []	## a = CLRJ
    while char in new_text:	## char = CLRJ | new_text = CLRJ
        a.append(new_text.index(char))	## a = CLRJ | new_text = CLRJ | char = CLRJ
        new_text = new_text.replace(char,"",1)	## new_text = CLRJ | char = CLRJ
    return a	## a = CLRJ
