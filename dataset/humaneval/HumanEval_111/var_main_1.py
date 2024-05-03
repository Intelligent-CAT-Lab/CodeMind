def histogram(test):
    dict1={}	## dict1 = CLRJ
    list1=test.split(" ")	## list1 = CLRJ|test = CLRJ
    t=0	## t = CLRJ

    for i in list1:	## i = CLRJ|list1 = CLRJ
        if(list1.count(i)>t) and i!='':	## list1 = CLRJ|i = CLRJ|t = CLRJ
            t=list1.count(i)	## t = CLRJ|list1 = CLRJ|i = CLRJ
    if t>0:	## t = CLRJ
        for i in list1:	## i = CLRJ|list1 = CLRJ
            if(list1.count(i)==t):	## list1 = CLRJ|i = CLRJ|t = CLRJ
                
                dict1[i]=t	## dict1 = CLRJ|i = CLRJ|t = CLRJ
    return dict1	## dict1 = CLRJ
