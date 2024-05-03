def rounded_avg(n, m):
    if m < n:	## m = CLRJ|n = CLRJ
        return -1
    summation = 0	## summation = CLRJ
    for i in range(n, m+1):	## i = CLRJ|n = CLRJ|m = CLRJ
        summation += i	## summation = CLRJ|i = CLRJ
    return bin(round(summation/(m - n + 1)))	## summation = CLRJ|m = CLRJ|n = CLRJ
