class main:
    import sys
    
    def calculate_amount(a, b, c):
        amount = 0
        time = a
        i = 2
        while time <= c + 0.5:
            amount += b
            time = a * i
            i += 1
        return amount
    
    if __name__ == "__main__":
        a, b, c = map(int, sys.stdin.readline().split())
        print(calculate_amount(a, b, c))