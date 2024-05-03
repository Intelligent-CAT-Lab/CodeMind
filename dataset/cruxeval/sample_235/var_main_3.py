def f(array, arr):
    result = []	## <state>result = CLRJ</state>
    for s in arr:	## <state>arr = CLRJ</state>
        result += list(filter(lambda l: l != '', s.split(arr[array.index(s)])))
    return result	## <state>result = CLRJ</state>
