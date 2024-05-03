def f(sample):
    i = -1	## {"i" : ''}
    while sample.find('/', i+1) != -1:	## {"sample" : '',"i" : ''}
        i = sample.find('/', i+1)	## {"i" : '',"sample" : ''}
    return sample.rindex('/', 0, i)	## {"sample" : '',"i" : ''}
