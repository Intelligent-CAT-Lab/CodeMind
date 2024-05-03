def fizz_buzz(n: int):
    ns = []	## ns = CLRJ
    for i in range(n):	## i = CLRJ|n = CLRJ
        if i % 11 == 0 or i % 13 == 0:	## i = CLRJ
            ns.append(i)	## ns = CLRJ|i = CLRJ
    s = ''.join(list(map(str, ns)))	## s = CLRJ|ns = CLRJ
    ans = 0	## ans = CLRJ
    for c in s:	## c = CLRJ|s = CLRJ
        ans += (c == '7')	## ans = CLRJ|c = CLRJ
    return ans	## ans = CLRJ
