def f(x):
    if x == []:	## <state>x = CLRJ</state>
        return -1
    else:
        cache = {}	## <state>cache = CLRJ</state>
        for item in x:	## <state>item = CLRJ | x = CLRJ</state>
            if item in cache:	## <state>item = CLRJ | cache = CLRJ</state>
                cache[item] += 1	## <state>cache = CLRJ | item = CLRJ</state>
            else:
                cache[item] = 1	## <state>cache = CLRJ | item = CLRJ</state>
        return max(cache.values())	## <state>cache = CLRJ</state>
