class main:
    def solver(n, x):
        sum = 0
        if x == n - x:
            sum = 3 * x
            return sum
        else:
            if x > n - x:
                sum += x + n - x
                sum += calc(x, n - x, False)
            else:
                sum += x + n - x
                sum += calc(x, n - x, False)
            return sum
    
    def calc(x, y, first):
        sum = 0
        if x % y == 0:
            if first:
                sum += y
            sum += (x // y * 2 - 1) * y
            return sum
        else:
            if first:
                sum += y
            sum += (x // y * 2) * y
            sum += calc(y, x % y, False)
            return sum
    
    def main():
        n, x = map(int, input().split())
        print(solver(n, x))
    
    if __name__ == "__main__":
        main()