class main:
    import sys
    
    def calc(n, a, b):
        output = ""
        for i in range(n - a + 1, n + 1):
            output += str(i) + " "
        rest = n - a - b + 1
        if rest < 0:
            print(-1)
            return
        elif rest >= 1:
            if not calc_inner(rest, a - 1, b - 1):
                print(-1)
                return
        for i in range(n - a, rest + 1, -1):
            output += str(i) + " "
        output = output[:-1]
        print(output)
    
    def calc_inner(n, a, b):
        first = ""
        second = ""
        while True:
            if a <= 0 or b <= 0:
                return False
            first_i = (n - a + 1 >= 1) and n - a + 1 or 1
            for i in range(first_i, n + 1):
                first += str(i) + " "
            rest = n - a - b + 1
            end_i = (rest + 1 >= 1) and rest + 1 or 1
            second = first[:first_i - 1] + second
            if rest <= 0:
                output += first
                output += second
                return True
            else:
                n = rest
                a -= 1
                b -= 1
        return False
    
    if __name__ == "__main__":
        n, a, b = map(int, sys.stdin.readline().strip().split())
        calc(n, a, b)