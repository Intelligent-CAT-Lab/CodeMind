def f(sample):
    i = -1	## i = CLRJ
    while sample.find('/', i+1) != -1:	## sample = CLRJ | i = CLRJ
        i = sample.find('/', i+1)	## i = CLRJ | sample = CLRJ
    return sample.rindex('/', 0, i)	## sample = CLRJ | i = CLRJ
