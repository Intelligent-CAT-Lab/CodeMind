def f(text, char):
    if char in text:	## char = CLRJ | text = CLRJ
        suff, char, pref = text.partition(char)	## suff = CLRJ | char = CLRJ | pref = CLRJ | text = CLRJ
        pref = suff[:-len(char)] + suff[len(char):] + char + pref	## pref = CLRJ | suff = CLRJ | char = CLRJ
        return suff + char + pref	## suff = CLRJ | char = CLRJ | pref = CLRJ
    return text