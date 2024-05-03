def f(text, letter):
    t = text	## <state>t = CLRJ | text = CLRJ</state>
    for alph in text:	## <state>alph = CLRJ | text = CLRJ</state>
        t = t.replace(alph, "")	## <state>t = CLRJ | alph = CLRJ</state>
    return len(t.split(letter))	## <state>t = CLRJ | letter = CLRJ</state>
