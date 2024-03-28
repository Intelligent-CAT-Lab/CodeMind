class main:
    input = input()
    p = 0
    g = 1
    result = 0
    for i in range(1, len(input)):
        if input[i] == 'g':
            if p + 1 <= g:
                result += 1
                p += 1
            else:
                g += 1
        else:
            if p + 1 <= g:
                p += 1
            else:
                g += 1
                result -= 1
    print(result)
    
    
    
    
    n = int(input())
    a = list(map(int, input().split()))
    
    a.sort()
    
    print(a[n//2] - a[n//2 - 1])
    
    /atcoder/atcoder_ABC081_B.md
    # atcoder ABC081 B - Shift only