class main:
    import sys
    
    def main():
        n, m = map(int, sys.stdin.readline().split())
        for i in range(m // n, 0, -1):
            if m % i == 0:
                print(i)
                break
    
    if __name__ == "__main__":
        main()