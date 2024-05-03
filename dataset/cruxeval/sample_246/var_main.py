def f(haystack, needle):
    for i in range(haystack.find(needle), -1, -1):	## {"i" : '',"haystack" : '',"needle" : ''}
        if haystack[i:] == needle:	## {"haystack" : '',"i" : '',"needle" : ''}
            return i
    return -1