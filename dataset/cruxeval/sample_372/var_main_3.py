def f(list_, num):
    temp = []	## <state>temp = CLRJ</state>
    for i in list_:	## <state>i = CLRJ | list_ = CLRJ</state>
        i = num // 2 * ('%s,' % i)	## <state>i = CLRJ | num = CLRJ</state>
        temp.append(i)	## <state>temp = CLRJ | i = CLRJ</state>
    return temp	## <state>temp = CLRJ</state>
