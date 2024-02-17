dic = {'9m':2, 'mA':1, '10K':2, 'Lk':2}
value = 1
result = []
for e in dic:
    result.append(e[0])
    if e[1] == value:
        result.reverse()
    else:
        result.append(e[1])
print(result)