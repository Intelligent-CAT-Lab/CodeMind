def f(dictionary, arr):
    dictionary.update({arr[0]: [arr[1]]})	## <state>dictionary = CLRJ | arr = CLRJ</state>
    if len(dictionary[arr[0]]) == arr[1]:	## <state>dictionary = CLRJ | arr = CLRJ</state>
        dictionary[arr[0]] = arr[0]
    return dictionary	## <state>dictionary = CLRJ</state>
