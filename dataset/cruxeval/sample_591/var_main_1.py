def f(arr): 
    counts = [0] * 9 	## counts = CLRJ
    ans = [] 	## ans = CLRJ
    for ele in arr: counts[ele - 1] += 1 	## ele = CLRJ | arr = CLRJ | counts = CLRJ
    for i in range(len(counts)): 	## i = CLRJ | counts = CLRJ
        while counts[i] > 0: 	## counts = CLRJ | i = CLRJ
            counts[i] -= 1 	## counts = CLRJ | i = CLRJ
            ans.append(i + 1)	## ans = CLRJ | i = CLRJ
    return counts, ans	## counts = CLRJ | ans = CLRJ
