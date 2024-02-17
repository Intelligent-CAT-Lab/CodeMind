def f(haystack, needle):
    for i in range(haystack.find(needle), -1, -1):
        if haystack[i:] == needle:
            return i
    return -1