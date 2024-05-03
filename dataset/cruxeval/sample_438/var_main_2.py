def f(string):
    bigTab = 100	## bigTab = []
    for i in range(10, 30):	## i = []
        if 0 < string.count('\t') < 20:	## string = []
            bigTab = i	## bigTab = [] | i = []
            break
    return string.expandtabs(bigTab)	## string = [] | bigTab = []
