class main:
    s = input()
    if s == 'keyence':
        print('YES')
    else:
        for i in range(len(s)):
            for j in range(i+1, len(s)+1):
                if s[:i]+s[j:] == 'keyence':
                    print('YES')
                    break
            else:
                continue
            break
        else:
            print('NO')