def f(string):
    while string:	## string = CLRJ
        if string[-1].isalpha():	## string = CLRJ
            return string
        string = string[:-1]	## string = CLRJ
    return string	## string = CLRJ
