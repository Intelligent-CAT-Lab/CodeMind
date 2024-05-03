def f(list):
    original = list[:]	## original = CLRJ | list = CLRJ
    while len(list) > 1:	## list = CLRJ
        list.pop(len(list) - 1)
        for i in range(len(list)):
            list.pop(i)
    list = original[:]	## list = CLRJ | original = CLRJ
    if list:	## list = CLRJ
        list.pop(0)
    return list	## list = CLRJ
