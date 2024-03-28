class main:
    import sys
    
    def main():
        h, a = map(int, sys.stdin.readline().split())
        n = h // a
        if h % a > 0:
            n += 1
        print(n)
    
    if __name__ == "__main__":
        main()