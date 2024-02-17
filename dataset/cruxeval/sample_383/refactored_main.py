text = 'ellod!p.nkyp.exa.bi.y.hain'
chars = '.n.in.ha.y'
result = list(text)
while chars in result[-3::-2]:
    result.remove(result[-3])
    result.remove(result[-3])
print(''.join(result).strip('.'))