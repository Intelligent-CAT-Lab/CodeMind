arr = [1, 15, 51, 45, 33, 100, 12, 18, 9]
MSIBS = arr[:] 
for i in range(len(arr)): 
    for j in range(0, i): 
        if arr[i] > arr[j] and MSIBS[i] < MSIBS[j] + arr[i]: 
            MSIBS[i] = MSIBS[j] + arr[i] 
MSDBS = arr[:] 
for i in range(1, len(arr) + 1): 
    for j in range(1, i): 
        if arr[-i] > arr[-j] and MSDBS[-i] < MSDBS[-j] + arr[-i]: 
            MSDBS[-i] = MSDBS[-j] + arr[-i] 
max_sum = float("-Inf") 
for i, j, k in zip(MSIBS, MSDBS, arr): 
    max_sum = max(max_sum, i + j - k) 
print(max_sum)