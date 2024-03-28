class main:
    s = input()
    ans = 101
    for i in range(26):
        target = chr(i + ord('a'))
        maximum = 0
        current = 0
        for j in s:
            if j == target:
                current = 0
            else:
                current += 1
                maximum = max(maximum, current)
        ans = min(ans, maximum)
    
    print(ans)