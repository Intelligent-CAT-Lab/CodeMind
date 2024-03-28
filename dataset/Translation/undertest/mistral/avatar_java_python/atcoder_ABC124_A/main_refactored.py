class main:
    def solve():
        a = int(input())
        b = int(input())
        if a == b:
            return a * 2
        elif a > b:
            return a * 2 - 1
        else:
            return b * 2 - 1
    
    print(solve())