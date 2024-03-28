class main:
    import sys
    
    s = sys.stdin.readline().strip()
    last = [-1] * 26
    for i in range(len(s)):
        ch = ord(s[i]) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            print(last[ch] + 1, i + 1)
            break
        last[ch] = i
    else:
        print(-1, -1)