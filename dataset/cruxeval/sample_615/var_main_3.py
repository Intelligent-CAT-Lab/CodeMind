def f(in_list, num):
    in_list.append(num)	## <state>in_list = CLRJ | num = CLRJ</state>
    return in_list.index(max(in_list[:-1]))	## <state>in_list = CLRJ</state>
