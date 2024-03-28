class main:
    import sys
    
    def solve(s):
        l = len(s)
        if l % 2 == 0 ^ s[0] == s[-1]:
            print("Second")
        else:
            print("First")
    
    def main():
        s = sys.stdin.readline().strip()
        solve(s)
    
    if __name__ == "__main__":
        main()