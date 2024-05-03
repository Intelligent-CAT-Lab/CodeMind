def f(array, elem):
    for idx, e in enumerate(array):	## <state>idx = CLRJ | e = CLRJ | array = CLRJ</state>
        if e > elem and array[idx - 1] < elem:	## <state>e = CLRJ | elem = CLRJ | array = CLRJ | idx = CLRJ</state>
            array.insert(idx, elem)	## <state>array = CLRJ | idx = CLRJ | elem = CLRJ</state>
    return array	## <state>array = CLRJ</state>
