def f(arr, d):
    for i in range(1, len(arr), 2):	## {"i" : '',"arr" : ''}
        d.update({arr[i]: arr[i-1]})	## {"d" : '',"arr" : '',"i" : ''}

    return d	## {"d" : ''}
