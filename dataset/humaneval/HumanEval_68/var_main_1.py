def pluck(arr):
    if(len(arr) == 0): return []	## arr = CLRJ
    evens = list(filter(lambda x: x%2 == 0, arr))	## evens = CLRJ|x = CLRJ|arr = CLRJ
    if(evens == []): return []	## evens = CLRJ
    return [min(evens), arr.index(min(evens))]	## evens = CLRJ|arr = CLRJ
