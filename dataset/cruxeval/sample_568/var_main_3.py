def f(num):
    letter = 1	## <state>letter = CLRJ</state>
    for i in '1234567890':	## <state>i = CLRJ</state>
        num = num.replace(i,'')	## <state>num = CLRJ | i = CLRJ</state>
        if len(num) == 0: break	## <state>num = CLRJ</state>
        num = num[letter:] + num[:letter]	## <state>num = CLRJ | letter = CLRJ</state>
        letter += 1	## <state>letter = CLRJ</state>
    return num	## <state>num = CLRJ</state>
