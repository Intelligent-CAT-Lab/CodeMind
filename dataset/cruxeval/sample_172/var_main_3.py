def f(array):
    for i in range(len(array)):	## <state>array = CLRJ</state>
        if array[i] < 0:
            array.pop(i)
    return array	## <state>array = CLRJ</state>
