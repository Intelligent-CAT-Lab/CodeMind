def f(phrase):
    result = ''	## <state>result = CLRJ</state>
    for i in phrase:	## <state>i = CLRJ | phrase = CLRJ</state>
        if not i.islower():	## <state>i = CLRJ</state>
            result += i	## <state>result = CLRJ | i = CLRJ</state>
    return result	## <state>result = CLRJ</state>
