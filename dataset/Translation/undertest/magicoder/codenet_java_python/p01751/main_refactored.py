class main:
    import sys
    
    def main():
        a, b, c = map(int, sys.stdin.readline().split())
        d = a + b
        e = -1
        for i in range(1000):
            if 0 <= (60*i+c)%d and (60*i+c)%d <= a:
                e = i
                break
        if e == -1:
            print(-1)
        else:
            print(60*e+c)
    
    if __name__ == "__main__":
        main()