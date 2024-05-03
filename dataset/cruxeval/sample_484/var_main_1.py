def f(arr):
    result = []	## result = CLRJ
    for item in arr:	## item = CLRJ | arr = CLRJ
        try:
            if item.isnumeric():	## item = CLRJ
                result.append(int(item)*2)	## result = CLRJ | item = CLRJ
        except ValueError:
            result.append(item[::-1])
    return result	## result = CLRJ
