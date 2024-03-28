class main:
    import sys
    
    S = sys.stdin.readline().strip()
    
    if S[0]!= 'A':
        print('WA')
        exit()
    
    count = 0
    index = 0
    for i in range(2, len(S) - 1):
        if S[i] == 'C':
            count += 1
            index = i
    
    if count!= 1:
        print('WA')
        exit()
    
    for i in range(len(S)):
        if i == 0 or i == index:
            continue
        if S[i] >= 'A' and S[i] <= 'Z':
            print('WA')
            exit()
    
    print('AC')