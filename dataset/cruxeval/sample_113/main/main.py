def f(line):
    count = 0
    a = []
    for i in range(len(line)):
        count += 1
        if count%2==0:
            a.append(line[i].swapcase())
        else:
            a.append(line[i])
    return ''.join(a)