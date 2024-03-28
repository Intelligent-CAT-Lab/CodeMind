class main:
    import sys
    
    res = sys.stdin.readline().strip()
    day = len(res)
    nday = 15-day
    cnt = 0
    for i in range(day):
        if res[i] == 'o':
            cnt += 1
    if day <= 7 or (day >= 8 and (cnt+nday) >= 8):
        print('YES')
    else:
        print('NO')