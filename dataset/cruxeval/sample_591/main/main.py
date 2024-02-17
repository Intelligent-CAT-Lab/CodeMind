def f(arr): 
    counts = [0] * 9 
    ans = [] 
    for ele in arr: counts[ele - 1] += 1 
    for i in range(len(counts)): 
        while counts[i] > 0: 
            counts[i] -= 1 
            ans.append(i + 1)
    return counts, ans