dic = {"Bulls": 23, "White Sox": 45}
inx = "Bulls"
try:
    dic[list(dic)[list(dic).index(inx)]] = list(dic)[list(dic).index(inx)].lower()
except ValueError:
    pass
print(list(dic.items()))