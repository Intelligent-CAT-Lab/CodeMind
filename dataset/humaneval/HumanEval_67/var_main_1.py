def fruit_distribution(s,n):
    lis = list()	## lis = CLRJ
    for i in s.split(' '):	## i = CLRJ|s = CLRJ
        if i.isdigit():	## i = CLRJ
            lis.append(int(i))	## lis = CLRJ|i = CLRJ
    return n - sum(lis)	## n = CLRJ|lis = CLRJ
