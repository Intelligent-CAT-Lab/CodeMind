sample = 'present/here/car%2Fwe'
i = -1
while sample.find('/', i+1) != -1:
    i = sample.find('/', i+1)
print(sample.rindex('/', 0, i))