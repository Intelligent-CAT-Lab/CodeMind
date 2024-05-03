def f(arr):
    arr = list(arr)	## <state>arr = CLRJ</state>
    arr.clear()	## <state>arr = CLRJ</state>
    arr.append('1')	## <state>arr = CLRJ</state>
    arr.append('2')	## <state>arr = CLRJ</state>
    arr.append('3')	## <state>arr = CLRJ</state>
    arr.append('4')	## <state>arr = CLRJ</state>
    return ','.join(arr)	## <state>arr = CLRJ</state>
