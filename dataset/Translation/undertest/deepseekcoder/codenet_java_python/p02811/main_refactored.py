class main:
    import sys
    
    def main():
        K, X = map(int, sys.stdin.readline().split())
    
        if X <= 500*K:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()