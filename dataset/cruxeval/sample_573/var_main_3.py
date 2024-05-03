def f(string, prefix):
    if string.startswith(prefix):	## <state>string = CLRJ | prefix = CLRJ</state>
        return string.removeprefix(prefix)
    return string	## <state>string = CLRJ</state>
