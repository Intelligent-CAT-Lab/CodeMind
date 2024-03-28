class main:
    import sys
    
    s = sys.stdin.readline().strip()
    last = [-1] * 26
    for i, char in enumerate(s):
        ch = ord(char) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            print(last[ch] + 1, i + 1)
            return
        last[ch] = i
    print("-1 -1")