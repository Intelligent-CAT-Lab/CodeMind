def f(x):
    if x == []:
        return -1
    else:
        cache = {}
        for item in x:
            if item in cache:
                cache[item] += 1
            else:
                cache[item] = 1
        return max(cache.values())