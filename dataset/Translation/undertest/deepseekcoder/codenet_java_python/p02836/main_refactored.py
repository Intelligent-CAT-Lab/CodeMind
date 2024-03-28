class main:
    def count_diff(s):
        length = len(s)
        count = 0
        for i in range(length//2):
            if s[i] != s[length - 1 -i ]:
                count += 1
        return count
    
    s = input()
    print(count_diff(s))