def f(dictionary, arr):
    dictionary.update({arr[0]: [arr[1]]})	## dictionary = CLRJ | arr = CLRJ
    if len(dictionary[arr[0]]) == arr[1]:	## dictionary = CLRJ | arr = CLRJ
        dictionary[arr[0]] = arr[0]
    return dictionary	## dictionary = CLRJ
