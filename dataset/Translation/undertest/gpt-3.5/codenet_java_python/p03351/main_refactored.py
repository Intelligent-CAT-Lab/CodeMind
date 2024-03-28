class main:
    def check_distance(a, b, c, d):
        ab = abs(a - b)
        ac = abs(a - c)
        bc = abs(b - c)
        
        if ac <= d or (ab <= d and bc <= d):
            return "Yes"
        else:
            return "No"
    
    # Test input
    a, b, c, d = map(int, input().split())
    print(check_distance(a, b, c, d))