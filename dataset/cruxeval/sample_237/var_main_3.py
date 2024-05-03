def f(text, char):
    if char in text:	## <state>char = CLRJ | text = CLRJ</state>
        suff, char, pref = text.partition(char)	## <state>suff = CLRJ | char = CLRJ | pref = CLRJ | text = CLRJ</state>
        pref = suff[:-len(char)] + suff[len(char):] + char + pref	## <state>pref = CLRJ | suff = CLRJ | char = CLRJ</state>
        return suff + char + pref	## <state>suff = CLRJ | char = CLRJ | pref = CLRJ</state>
    return text