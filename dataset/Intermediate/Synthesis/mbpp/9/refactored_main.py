str = "aaaa"
tmp = str + str
n = len(str) 
for i in range(1,n + 1): 
    substring = tmp[i: i+n] 
    if (str == substring): 
        res = i
        break
else:
    res = n
print(res)