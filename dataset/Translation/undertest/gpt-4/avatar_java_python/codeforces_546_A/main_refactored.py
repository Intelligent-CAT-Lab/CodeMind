class main:
    def calculate_borrow(o, n, g):
        x = sum(i * o for i in range(1, g + 1))
        borrow = x - n
        return max(borrow, 0)
    
    # Test input
    o, n, g = map(int, input().split())
    result = calculate_borrow(o, n, g)
    print(result)