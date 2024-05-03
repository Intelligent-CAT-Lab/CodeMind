def f(string, encryption):
    if encryption == 0:	## encryption = CLRJ
        return string	## string = CLRJ
    else:
        return string.upper().encode('rot13')