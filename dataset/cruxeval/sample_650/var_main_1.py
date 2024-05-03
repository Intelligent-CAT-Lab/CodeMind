def f(string, substring):
    while string.startswith(substring):	## string = CLRJ | substring = CLRJ
        string = string[len(substring):len(string)]
    return string	## string = CLRJ
