class main:
    import re
    
    def solve(s):
        s = re.sub(r',', ' ', s)
        s = re.sub(r'\.', '', s)
        tokens = s.split()
        result = []
        for token in tokens:
            if len(token) >= 3 and len(token) <= 6:
                result.append(token)
        return ' '.join(result)
    
    s = "Rain, rain, go to Spain."
    print(solve(s))