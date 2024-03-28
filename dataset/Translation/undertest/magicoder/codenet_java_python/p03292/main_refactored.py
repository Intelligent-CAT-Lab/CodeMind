class main:
    import sys
    
    def main():
        T, R, Y = map(int, sys.stdin.readline().split())
    
        A = max(T, R, Y)
        B = min(T, R, Y)
    
        print(A - B)
    
    if __name__ == "__main__":
        main()