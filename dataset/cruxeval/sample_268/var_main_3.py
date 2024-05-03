def f(s, separator):
    for i in range(len(s)):	## <state>i = CLRJ | s = CLRJ</state>
        if s[i] == separator:	## <state>s = CLRJ | i = CLRJ | separator = CLRJ</state>
            new_s = list(s)	## <state>new_s = CLRJ | s = CLRJ</state>
            new_s[i] = '/'	## <state>new_s = CLRJ | i = CLRJ</state>
            return ' '.join(new_s)	## <state>new_s = CLRJ</state>
