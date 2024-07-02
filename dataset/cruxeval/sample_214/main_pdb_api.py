def f(sample):
    i = -1
    while sample.find('/', i+1) != -1:
        i = sample.find('/', i+1)
    return sample.rindex('/', 0, i)
f('present/here/car%2Fwe')