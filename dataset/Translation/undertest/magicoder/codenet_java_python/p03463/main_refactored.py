class main:
    import sys
    
    def main():
        n, a, b = map(int, sys.stdin.readline().split())
        k = b - a
        if k % 2 == 1:
            print("Borys")
        else:
            print("Alice")
    
    if __name__ == "__main__":
        main()