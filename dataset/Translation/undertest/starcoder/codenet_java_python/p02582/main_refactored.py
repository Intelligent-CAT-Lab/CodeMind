class main:
    import sys
    
    s = sys.stdin.readline().strip()
    
    if s[0] == 'R' and s[1] == 'R' and s[2] == 'R':
        print(3)
    elif s[0] == 'R' and s[1] == 'R':
        print(2)
    elif s[1] == 'R' and s[2] == 'R':
        print(2)
    elif s[0] == 'S' and s[1] == 'S' and s[2] == 'S':
        print(0)
    else:
        print(1)