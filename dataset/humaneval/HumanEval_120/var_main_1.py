def maximum(arr, k):
    if k == 0:	## k = CLRJ
        return []
    arr.sort()	## arr = CLRJ
    ans = arr[-k:]	## ans = CLRJ|arr = CLRJ|k = CLRJ
    return ans	## ans = CLRJ
