class main:
    import sys
    
    input = sys.stdin.readline().split()
    monsterHP = int(input[0])
    servalATK = int(input[1])
    
    mod = monsterHP % servalATK
    ans = monsterHP // servalATK
    
    if mod > 0:
        ans += 1
    
    print(ans)