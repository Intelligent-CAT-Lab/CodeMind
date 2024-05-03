def f(text):
    m = 0	## m = CLRJ
    cnt = 0	## cnt = CLRJ
    for i in text.split():	## i = CLRJ | text = CLRJ
        if len(i) > m:	## i = CLRJ | m = CLRJ
            cnt += 1	## cnt = CLRJ
            m = len(i)	## m = CLRJ | i = CLRJ
    return cnt	## cnt = CLRJ
