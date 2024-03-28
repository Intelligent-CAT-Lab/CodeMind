class main:
    import sys
    
    def main():
        # Taking input from stdin (standard input)
        a, b, c = map(int, input().split())
        d = a + b
        e = -1
        for i in range(1000):
            if 0 <= (60 * i + c) % d <= a:
                e = i
                break
        # Outputting the result to stdout (standard output)
        if e == -1:
            print(-1)
        else:
            print(60 * e + c)
    
    if __name__ == "__main__":
        main()