#coding:utf-8
data = "\\//"
xmax = len(data)
data_list = list(data)
data_list.reverse()
reverse_data = []
for sig in data_list:
    if sig == "\\":
        reverse_data.append("/")
    elif sig == "/":
        reverse_data.append("\\")
    else:
        reverse_data.append(sig)
reverse_data = "".join(reverse_data)
def partialSqu(h, sig):
    if sig == "\\":
        squ = h + 1/2
        h += 1
    elif sig == "/":
        squ = h - 1/2
        h -= 1
    elif sig == "_":
        squ = h
    return squ, h
x_squ_dict = {}
cnt = 0
sw, x, h, totalSqu = 0, 0, 0, 0
for sig in data:
    x += 1
    if sw == 0 and sig == "\\":
        sw = 1
    if sw == 1 :
        squ, h = partialSqu(h, sig)
        totalSqu += squ
        if h == 0:
            x_squ_dict[x] = totalSqu
            totalSqu = 0
            sw = 0
keys = x_squ_dict.keys()
sw, x, h, totalSqu = 0, 0, 0, 0
for sig in reverse_data:
    x += 1
    if sw == 0 and sig == "\\" :
        sw = 1
        x_p = xmax - x +1
    if sw == 1 :
        squ, h = partialSqu(h, sig)
        totalSqu += squ            
        if h == 0:
            x_squ_dict[x_p] = totalSqu
            totalSqu = 0
            sw = 0
keys = x_squ_dict.keys()
keys = list(keys)
keys.sort()
squ_list = []
for key in keys:
    squ_list.append(x_squ_dict[key])
a = int(sum(squ_list))
print(a)    
squ_list.insert(0,len(keys))
squ_list = " ".join([str(int(num)) for num in squ_list])
print(squ_list)
