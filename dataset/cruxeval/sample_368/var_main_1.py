def f(string, numbers):
    arr = []	## arr = CLRJ
    for num in numbers:	## num = CLRJ | numbers = CLRJ
        arr.append(string.zfill(num))	## arr = CLRJ | string = CLRJ | num = CLRJ
    return ' '.join(arr)	## arr = CLRJ
