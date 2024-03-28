class main:
    def count_black_white(s):
        count = 0
        black = 0
    
        for i in range(len(s)):
            if s[i] == 'W':
                count += black
            else:
                black += 1
    
        return count
    
    # Test
    s = input()
    print(count_black_white(s))