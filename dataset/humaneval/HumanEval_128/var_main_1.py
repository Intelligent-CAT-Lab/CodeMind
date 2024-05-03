def prod_signs(arr):
    if not arr: return None	## arr = CLRJ
    prod = 0 if 0 in arr else (-1) ** len(list(filter(lambda x: x < 0, arr)))	## prod = CLRJ|arr = CLRJ|x = CLRJ
    return prod * sum([abs(i) for i in arr])	## prod = CLRJ|i = CLRJ|arr = CLRJ
