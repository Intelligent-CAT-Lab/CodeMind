def f(array):
    a = []	## <state>a = CLRJ</state>
    array.reverse()	## <state>array = CLRJ</state>
    for i in range(len(array)):	## <state>array = CLRJ</state>
        if array[i] != 0:
            a.append(array[i])
    a.reverse()	## <state>a = CLRJ</state>
    return a	## <state>a = CLRJ</state>
