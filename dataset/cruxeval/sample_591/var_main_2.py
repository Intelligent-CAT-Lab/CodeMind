def f(arr): 
    counts = [0] * 9 	## counts = []
    ans = [] 	## ans = []
    for ele in arr: counts[ele - 1] += 1 	## ele = [] | arr = [] | counts = []
    for i in range(len(counts)): 	## i = [] | counts = []
        while counts[i] > 0: 	## counts = [] | i = []
            counts[i] -= 1 	## counts = [] | i = []
            ans.append(i + 1)	## ans = [] | i = []
    return counts, ans	## counts = [] | ans = []
