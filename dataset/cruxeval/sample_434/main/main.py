def f(string):
    try:
       return string.rfind('e')
    except AttributeError:
        return "Nuk"