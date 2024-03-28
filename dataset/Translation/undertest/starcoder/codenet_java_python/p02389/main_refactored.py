class main:
    import sys
    
    def main():
        input = sys.stdin.readline
        a, b = map(int, input().split())
        print(a*b, 2*a+2*b)
    
    if __name__ == '__main__':
        main()