dic = dict(did=0)
key = 'u'
dic = dict(dic)
v = dic.pop(key, 0)
if v == 0:
    ret_value = 'No such key!'
while len(dic) > 0:
    dic[dic.popitem()[1]] = dic.popitem()[0]
ret_value = int(dic.popitem()[0])
print(ret_value)