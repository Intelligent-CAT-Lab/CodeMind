class main:
    import sys
    
    def solve():
        s = input().strip()
        l = len(s)
    
        if l % 2 == 0 ^ s[0] == s[-1]:
            print("Second")
        else:
            print("First")
    
    def main():
        solve()
    
    if __name__ == "__main__":
        main()