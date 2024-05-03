def f(string):
    if string.isupper():	## string = CLRJ
        return string.lower()
    elif string.islower():	## string = CLRJ
        return string.upper()
    return string	## string = CLRJ
