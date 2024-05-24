arr = [1,1,2,2,3]
n = len(arr)
XOR = 0
for i in range(n) :
    XOR = XOR ^ arr[i]
print(XOR)