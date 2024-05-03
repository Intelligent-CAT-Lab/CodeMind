def f(string):
    tmp = string.lower()	## <state>tmp = CLRJ | string = CLRJ</state>
    for char in string.lower():	## <state>char = CLRJ | string = CLRJ</state>
        if char in tmp:	## <state>char = CLRJ | tmp = CLRJ</state>
            tmp = tmp.replace(char, '', 1)	## <state>tmp = CLRJ | char = CLRJ</state>
    return tmp	## <state>tmp = CLRJ</state>
