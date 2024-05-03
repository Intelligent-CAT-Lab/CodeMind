def f(string, encryption):
    if encryption == 0:	## encryption = []
        return string	## string = []
    else:
        return string.upper().encode('rot13')