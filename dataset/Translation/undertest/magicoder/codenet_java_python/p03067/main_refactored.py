class main:
    import sys
    
    def solve(a, b, c):
        if (c >= a and c <= b) or (c >= b and c <= a):
            print("Yes")
        else:
            print("No")
    
    def main():
        a, b, c = map(int, sys.stdin.readline().split())
        solve(a, b, c)
    
    if __name__ == "__main__":
        main()