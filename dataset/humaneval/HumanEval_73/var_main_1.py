def smallest_change(arr):
    ans = 0	## ans = CLRJ
    for i in range(len(arr) // 2):	## i = CLRJ|arr = CLRJ
        if arr[i] != arr[len(arr) - i - 1]:	## arr = CLRJ|i = CLRJ
            ans += 1	## ans = CLRJ
    return ans	## ans = CLRJ
