class main:
    n = int(input())
    s = " "
    
    while n > 0:
        x = n % 2
        n //= 2
        s += str(x) + " "
    
    ans = 0
    
    for i in range(len(s)):
        if s[i] == '1':
            ans += 1
    
    print(ans)