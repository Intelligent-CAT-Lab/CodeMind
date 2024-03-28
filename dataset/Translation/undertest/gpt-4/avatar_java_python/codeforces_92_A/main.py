def codeforces_92_A():
    n, k = map(int, input().split())
    i = 1
    req = 1
    
    while k - req >= 0:
        k -= req
        i += 1
        if i % n != 0:
            req = i % n
        else:
            req = n
    
    print(k)

# Test input
# To run the test case you can call the function like this:
# codeforces_92_A()

# Expected Output: 9