def codeforces_92_A(n, k):
    i = 1
    req = 1
    
    while k - req >= 0:
        k -= req
        i += 1
        if i % n != 0:
            req = i % n
        else:
            req = n
            
    return k

# Test input
n, k = map(int, input().split())

# Expected output
print(codeforces_92_A(n, k))