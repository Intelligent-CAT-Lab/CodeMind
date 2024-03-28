class main:
    def find_duplicates(s):
        last = [-1]*26
        for i, ch in enumerate(s):
            ch = ord(ch) - ord('a')
            if last[ch] >= 0 and i - last[ch] < 3:
                return last[ch] + 1, i + 1
            last[ch] = i
        return -1, -1
    
    s = input()
    start, end = find_duplicates(s)
    print(start, end)