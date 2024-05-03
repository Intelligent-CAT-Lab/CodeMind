def f(string, substring):
    while string.startswith(substring):	## <state>string = CLRJ | substring = CLRJ</state>
        string = string[len(substring):len(string)]
    return string	## <state>string = CLRJ</state>
