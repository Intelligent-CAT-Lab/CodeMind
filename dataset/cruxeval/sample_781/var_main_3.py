def f(s, ch):
    if ch not in s:	## <state>ch = CLRJ | s = CLRJ</state>
        return ''
    s = s.partition(ch)[2][::-1]	## <state>s = CLRJ | ch = CLRJ</state>
    for i in range(len(s)):	## <state>s = CLRJ</state>
        s = s.partition(ch)[2][::-1]
    return s	## <state>s = CLRJ</state>
