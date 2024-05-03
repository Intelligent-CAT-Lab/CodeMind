def f(num):
    letter = 1	## letter = CLRJ
    for i in '1234567890':	## i = CLRJ
        num = num.replace(i,'')	## num = CLRJ | i = CLRJ
        if len(num) == 0: break	## num = CLRJ
        num = num[letter:] + num[:letter]	## num = CLRJ | letter = CLRJ
        letter += 1	## letter = CLRJ
    return num	## num = CLRJ
