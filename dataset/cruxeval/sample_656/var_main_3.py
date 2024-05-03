def f(letters):
    a = [] 	## <state>a = CLRJ</state>
    for i in range(len(letters)):	## <state>i = CLRJ | letters = CLRJ</state>
        if letters[i] in a:	## <state>letters = CLRJ | i = CLRJ | a = CLRJ</state>
            return 'no'
        a.append(letters[i]) 	## <state>a = CLRJ | letters = CLRJ | i = CLRJ</state>
    return 'yes'