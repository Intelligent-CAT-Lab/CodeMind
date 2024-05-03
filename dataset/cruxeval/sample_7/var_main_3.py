def f(list):
    original = list[:]	## <state>original = CLRJ | list = CLRJ</state>
    while len(list) > 1:	## <state>list = CLRJ</state>
        list.pop(len(list) - 1)
        for i in range(len(list)):
            list.pop(i)
    list = original[:]	## <state>list = CLRJ | original = CLRJ</state>
    if list:	## <state>list = CLRJ</state>
        list.pop(0)
    return list	## <state>list = CLRJ</state>
