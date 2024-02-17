var = " 99 777"
if var.isdigit():
    print("int")
elif var.replace('.', '', 1).isdigit():
    print("float")
elif var.count(' ') == len(var) - 1:
    print("str")
elif len(var) == 1:
    print("char")
else:
    print("tuple")