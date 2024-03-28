class main:
    def count_operations(n):
        count = 0
        while n > 1:
            n = (n + (0 if n % 3 == 0 else 3 - n % 3)) // 3
            count += 1
        return count
    
    # Test input
    n = int(input())
    
    # Expected output
    print(count_operations(n))