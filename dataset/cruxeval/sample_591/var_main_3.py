def f(arr): 
    counts = [0] * 9 	## <state>counts = CLRJ</state>
    ans = [] 	## <state>ans = CLRJ</state>
    for ele in arr: counts[ele - 1] += 1 	## <state>ele = CLRJ | arr = CLRJ | counts = CLRJ</state>
    for i in range(len(counts)): 	## <state>i = CLRJ | counts = CLRJ</state>
        while counts[i] > 0: 	## <state>counts = CLRJ | i = CLRJ</state>
            counts[i] -= 1 	## <state>counts = CLRJ | i = CLRJ</state>
            ans.append(i + 1)	## <state>ans = CLRJ | i = CLRJ</state>
    return counts, ans	## <state>counts = CLRJ | ans = CLRJ</state>
