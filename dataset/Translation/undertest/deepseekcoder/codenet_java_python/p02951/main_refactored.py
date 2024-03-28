class main:
    import sys
    
    def main():
        a, b, c = map(int, sys.stdin.readline().split())
        if b + c < a:
            print(0)
        else:
            print(b + c - a)
    
    if __name__ == "__main__":
        main()