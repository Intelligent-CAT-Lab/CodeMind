def f(string):
    while string:	## string = []
        if string[-1].isalpha():	## string = []
            return string
        string = string[:-1]	## string = []
    return string	## string = []
