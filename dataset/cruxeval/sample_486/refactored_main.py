dic = {1:1, 2:2, 3:3}
dic_op = dic.copy()
for key, val in dic.items():
    dic_op[key] = val * val
print(dic_op)