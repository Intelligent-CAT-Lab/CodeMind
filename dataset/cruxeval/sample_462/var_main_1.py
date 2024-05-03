def f(text, value):
    length = len(text)	## length = CLRJ | text = CLRJ
    letters = list(text)	## letters = CLRJ | text = CLRJ
    if value not in letters:	## value = CLRJ | letters = CLRJ
        value = letters[0]
    return value * length	## value = CLRJ | length = CLRJ
