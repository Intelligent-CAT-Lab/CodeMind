class main:
    import sys
    
    def main():
        n, k = map(int, sys.stdin.readline().split())
        if (n*k) % 2 == 1:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()