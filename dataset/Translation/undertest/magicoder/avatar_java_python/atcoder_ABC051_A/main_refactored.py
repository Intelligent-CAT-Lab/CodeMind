class main:
    import sys
    
    def main():
        a, b, c = map(str, sys.stdin.readline().split(','))
        print(a + " " + b + " " + c)
    
    if __name__ == "__main__":
        main()