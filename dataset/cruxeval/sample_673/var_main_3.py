def f(string):
    if string.isupper():	## <state>string = CLRJ</state>
        return string.lower()
    elif string.islower():	## <state>string = CLRJ</state>
        return string.upper()
    return string	## <state>string = CLRJ</state>
