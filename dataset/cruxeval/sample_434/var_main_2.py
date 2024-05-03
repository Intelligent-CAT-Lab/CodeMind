def f(string):
    try:
       return string.rfind('e')	## string = []
    except AttributeError:
        return "Nuk"