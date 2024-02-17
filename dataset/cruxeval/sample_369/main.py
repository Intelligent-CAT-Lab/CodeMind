def f(var):
    if var.isdigit():
        return "int"
    elif var.replace('.', '', 1).isdigit():
        return "float"
    elif var.count(' ') == len(var) - 1:
        return "str"
    elif len(var) == 1:
        return "char"
    else:
        return "tuple"