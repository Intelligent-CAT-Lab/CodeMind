class main:
    def check_divisible(n):
        for a in range(1, 10):
            if n % a == 0 and n // a < 10:
                return "Yes"
        return "No"
    
    # Test input
    N = int(input())
    print(check_divisible(N))