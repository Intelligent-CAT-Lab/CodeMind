def f(var):
    if var.isdigit():	## var = CLRJ
        return "int"
    elif var.replace('.', '', 1).isdigit():	## var = CLRJ
        return "float"
    elif var.count(' ') == len(var) - 1:	## var = CLRJ
        return "str"
    elif len(var) == 1:	## var = CLRJ
        return "char"
    else:
        return "tuple"