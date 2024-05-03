def f(string):
    try:
       return string.rfind('e')	## string = CLRJ
    except AttributeError:
        return "Nuk"