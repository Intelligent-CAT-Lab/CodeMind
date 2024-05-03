def f(letters):
    a = [] 	## a = CLRJ
    for i in range(len(letters)):	## i = CLRJ | letters = CLRJ
        if letters[i] in a:	## letters = CLRJ | i = CLRJ | a = CLRJ
            return 'no'
        a.append(letters[i]) 	## a = CLRJ | letters = CLRJ | i = CLRJ
    return 'yes'