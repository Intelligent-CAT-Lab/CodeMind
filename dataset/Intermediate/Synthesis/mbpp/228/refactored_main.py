n = 4
l = 1
r = 2
num = (((1 << r) - 1) ^ ((1 << (l - 1)) - 1)) 
new_num = n & num
if (new_num == 0): 
    print(True)
else:
    print(False)