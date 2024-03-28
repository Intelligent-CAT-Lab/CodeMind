class main:
    def count_divisible(a, b, x):
        count = b // x - a // x
        if a % x == 0:
            count += 1
        return count
    
    # Sample test case
    a, b, x = map(int, input().split())
    print(count_divisible(a, b, x))