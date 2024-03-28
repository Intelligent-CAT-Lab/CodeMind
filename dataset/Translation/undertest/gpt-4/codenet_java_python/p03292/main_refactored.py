class main:
    def find_difference(t, r, y):
        a = max(max(t, r), y)
        b = min(min(t, r), y)
        return a - b
    
    # Sample test case
    t, r, y = map(int, input().split())
    print(find_difference(t, r, y))