def f(dictionary, arr):
    dictionary.update({arr[0]: [arr[1]]})	## dictionary = [] | arr = []
    if len(dictionary[arr[0]]) == arr[1]:	## dictionary = [] | arr = []
        dictionary[arr[0]] = arr[0]
    return dictionary	## dictionary = []
