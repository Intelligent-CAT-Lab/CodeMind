def f(string):
    while string:	## <state>string = CLRJ</state>
        if string[-1].isalpha():	## <state>string = CLRJ</state>
            return string
        string = string[:-1]	## <state>string = CLRJ</state>
    return string	## <state>string = CLRJ</state>
