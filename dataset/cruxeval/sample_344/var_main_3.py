def f(list, operation):
    new_list = list[:]	## <state>new_list = CLRJ | list = CLRJ</state>
    new_list.sort()	## <state>new_list = CLRJ</state>
    operation(new_list)
    return list