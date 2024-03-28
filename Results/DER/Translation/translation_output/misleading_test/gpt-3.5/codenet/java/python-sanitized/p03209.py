import sys

class Scanner:
    def __init__(self):
        self.data = sys.stdin.read().split()
        self.index = 0

    def next(self):
        self.index += 1
        return self.data[self.index - 1]

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

def main():
    sc = Scanner()
    n = sc.nextInt()
    x = sc.nextLong()
    
    print(calc(n, x))

def calc(n, x):
    if n == 0:
        return 1
    
    sum_val = 0
    x -= 1
    length_val = length(n-1)
    p_val = p(n-1)
    
    if x > 0:
        if length_val <= x:
            sum_val += p_val
        else:
            sum_val += calc(n-1, x)
        x -= length_val
    
    if x > 0:
        x -= 1
        sum_val += 1
    
    if x > 0:
        if length_val <= x:
            sum_val += p_val
        else:
            sum_val += calc(n-1, x)
    
    return sum_val

def length(n):
    return 1 + 4 * ((2 ** n) - 1)

def p(n):
    return 1 + 2 * ((2 ** n) - 1)

if __name__ == "__main__":
    main()