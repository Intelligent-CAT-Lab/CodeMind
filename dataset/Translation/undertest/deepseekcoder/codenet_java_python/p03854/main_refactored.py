class main:
    import re
    
    def solve(s):
        s = re.sub('eraser|erase|dreamer|dream', '-', s)
        if len(s.replace('-', '')) == 0:
            return 'YES'
        else:
            return 'NO'
    
    print(solve(input()))