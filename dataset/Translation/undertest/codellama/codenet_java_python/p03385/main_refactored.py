class main:
    import sys
    
    def is_abc(s):
        return all(c in "abc" for c in s)
    
    if __name__ == "__main__":
        s = sys.stdin.readline().strip()
        print("Yes" if is_abc(s) else "No")