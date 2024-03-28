def codeforces_581_A():
    a, b = map(int, input().split())
    count = 0
    while True:
        if a > 0 and b > 0:
            count += 1
            a -= 1
            b -= 1
        else:
            break
    ans = a // 2 + b // 2
    print(count, ans)

# Test the function with the sample input
codeforces_581_A()