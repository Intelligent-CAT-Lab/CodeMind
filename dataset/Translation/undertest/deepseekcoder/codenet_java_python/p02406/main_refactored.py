class main:
    import sys
    
    def find_numbers(x):
        if x >= 3 and x <= 10000:
            numbers = []
            for a in range(1, x+1):
                if a % 3 == 0 or '3' in str(a):
                    numbers.append(a)
            return numbers
    
    if __name__ == "__main__":
        x = int(sys.stdin.readline())
        numbers = find_numbers(x)
        print(*numbers)