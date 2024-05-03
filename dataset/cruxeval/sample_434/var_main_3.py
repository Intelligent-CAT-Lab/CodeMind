def f(string):
    try:
       return string.rfind('e')	## <state>string = CLRJ</state>
    except AttributeError:
        return "Nuk"