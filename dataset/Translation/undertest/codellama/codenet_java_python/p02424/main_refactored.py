class main:
    import sys
    
    def main():
        a, b = map(int, sys.stdin.readline().split())
        print(bin(a & b)[2:].zfill(32))
        print(bin(a | b)[2:].zfill(32))
        print(bin(a ^ b)[2:].zfill(32))
    
    if __name__ == "__main__":
        main()