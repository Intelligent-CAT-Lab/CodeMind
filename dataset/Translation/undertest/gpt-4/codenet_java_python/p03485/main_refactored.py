class main:
    def solve(a, b):
        return (a + b + 1) // 2
    
    if __name__ == '__main__':
        a, b = map(int, input().split())
        print(solve(a, b))