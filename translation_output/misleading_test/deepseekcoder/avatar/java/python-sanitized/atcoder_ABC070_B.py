def atcoder_ABC070_B(a, b, c, d):
    array = [0]*101
    
    for i in range(a, b):
        array[i] += 1
        
    for i in range(c, d):
        array[i] += 1
        
    ans = sum([1 for i in range(101) if array[i] == 2])
    
    return ans

# Test input
a, b, c, d = 0, 50, 50, 100

# Expected output
print(atcoder_ABC070_B(a, b, c, d))  # -21