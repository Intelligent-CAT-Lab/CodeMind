class main:
    import sys
    
    def main():
        a, b = map(int, sys.stdin.readline().split())
        k = a + b
        if k % 2 == 0:
            print(k // 2)
        else:
            print("IMPOSSIBLE")
    
    if __name__ == "__main__":
        main()