def f(sample):
    i = -1	## <state>i = CLRJ</state>
    while sample.find('/', i+1) != -1:	## <state>sample = CLRJ | i = CLRJ</state>
        i = sample.find('/', i+1)	## <state>i = CLRJ | sample = CLRJ</state>
    return sample.rindex('/', 0, i)	## <state>sample = CLRJ | i = CLRJ</state>
