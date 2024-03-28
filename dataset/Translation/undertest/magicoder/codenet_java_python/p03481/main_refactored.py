class main:
    import sys
    
    def main():
        X, Y = map(int, sys.stdin.readline().split())
    
        i = 0
        while X <= Y:
            i += 1
            X *= 2
    
        print(i)
    
    if __name__ == "__main__":
        main()