class main:
    import sys
    
    def main():
        n, k = map(int, sys.stdin.readline().split())
        
        if n <= k:
            print(1)
        else:
            print(0)
    
    if __name__ == "__main__":
        main()