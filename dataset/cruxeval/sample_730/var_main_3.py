def f(text):
    m = 0	## <state>m = CLRJ</state>
    cnt = 0	## <state>cnt = CLRJ</state>
    for i in text.split():	## <state>i = CLRJ | text = CLRJ</state>
        if len(i) > m:	## <state>i = CLRJ | m = CLRJ</state>
            cnt += 1	## <state>cnt = CLRJ</state>
            m = len(i)	## <state>m = CLRJ | i = CLRJ</state>
    return cnt	## <state>cnt = CLRJ</state>
