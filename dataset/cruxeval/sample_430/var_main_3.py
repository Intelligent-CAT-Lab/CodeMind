def f(arr1, arr2):
    new_arr = arr1.copy()	## <state>new_arr = CLRJ | arr1 = CLRJ</state>
    new_arr.extend(arr2)	## <state>new_arr = CLRJ | arr2 = CLRJ</state>
    return new_arr	## <state>new_arr = CLRJ</state>
