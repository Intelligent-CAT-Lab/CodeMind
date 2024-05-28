arr = [1,2,3]
n = len(arr)
arr.sort(reverse = True)
num = arr[0]
for i in range(1,n) : 
    num = num * 10 + arr[i]
print(num)