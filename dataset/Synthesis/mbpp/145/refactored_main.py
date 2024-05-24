arr = (2,1,5,3)
n = len(arr)
minEle = arr[0] 
maxEle = arr[0] 
for i in range(1, n): 
    minEle = min(minEle,arr[i]) 
    maxEle = max(maxEle,arr[i]) 
print(maxEle - minEle)