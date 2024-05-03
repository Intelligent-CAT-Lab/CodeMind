def f(string, encryption):
    if encryption == 0:	## <state>encryption = CLRJ</state>
        return string	## <state>string = CLRJ</state>
    else:
        return string.upper().encode('rot13')