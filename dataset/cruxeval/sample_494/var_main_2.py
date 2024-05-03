def f(num, l):
    t = ""	## t = []
    while l > len(num):	## l = [] | num = []
        t += '0'	## t = []
        l -= 1	## l = []
    return t + num	## t = [] | num = []
