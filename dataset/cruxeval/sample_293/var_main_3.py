def f(text):
    s = text.lower()	## <state>s = CLRJ | text = CLRJ</state>
    for i in range(len(s)):	## <state>i = CLRJ | s = CLRJ</state>
        if s[i] == 'x':	## <state>s = CLRJ | i = CLRJ</state>
            return 'no'
    return text.isupper()