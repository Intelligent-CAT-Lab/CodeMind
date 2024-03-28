class main:
    import math
    import sys
    
    def main():
        # Assuming input is provided in the same way as the example
        # and using sys.stdin.readline to mimic FastReader
        n, m = map(float, input().split())
        for i in range(int(m - (n % m))):
            print(int(n // m), end=" ")
        for i in range(int(m - (n % m)), int(m)):
            print(int(math.ceil(n / m)), end=" ")
        print()
    
    if __name__ == "__main__":
        main()