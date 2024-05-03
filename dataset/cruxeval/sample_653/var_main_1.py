def f(text, letter):
    t = text	## t = CLRJ | text = CLRJ
    for alph in text:	## alph = CLRJ | text = CLRJ
        t = t.replace(alph, "")	## t = CLRJ | alph = CLRJ
    return len(t.split(letter))	## t = CLRJ | letter = CLRJ
