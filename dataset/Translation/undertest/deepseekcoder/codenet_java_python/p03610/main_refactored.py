class main:
    import sys
    
    def remove_odd_indexed_characters(s):
        return ''.join([s[i] for i in range(len(s)) if i % 2 == 0])
    
    s = sys.stdin.readline().strip()
    print(remove_odd_indexed_characters(s))