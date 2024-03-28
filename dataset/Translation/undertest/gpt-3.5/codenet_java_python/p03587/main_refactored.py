class main:
    def solve():
        s = input()
        n = 0
        for c in s:
            if c == '1':
                n += 1
        print(n)
    
    if __name__ == "__main__":
        solve()