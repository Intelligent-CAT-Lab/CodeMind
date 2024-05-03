def f(text):
    letters = ''	## letters = CLRJ
    for i in range(len(text)):	## i = CLRJ | text = CLRJ
        if text[i].isalnum():	## text = CLRJ | i = CLRJ
            letters += text[i]	## letters = CLRJ | text = CLRJ | i = CLRJ
    return letters	## letters = CLRJ
