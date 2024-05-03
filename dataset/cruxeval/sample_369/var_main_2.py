def f(var):
    if var.isdigit():	## var = []
        return "int"
    elif var.replace('.', '', 1).isdigit():	## var = []
        return "float"
    elif var.count(' ') == len(var) - 1:	## var = []
        return "str"
    elif len(var) == 1:	## var = []
        return "char"
    else:
        return "tuple"